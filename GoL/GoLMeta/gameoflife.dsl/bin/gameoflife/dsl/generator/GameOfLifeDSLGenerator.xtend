package gameoflife.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import gameoflife.dsl.gameOfLifeDSL.Model
import gameoflife.dsl.gameOfLifeDSL.NeighborCondition

class GameOfLifeDSLGenerator extends AbstractGenerator {
    
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        println("Generator called for: " + resource.URI) // Debug line
        
        val model = resource.allContents.head as Model
        if (model !== null) {
            fsa.generateFile("GameOfLife/RulesOfLife.java", generateRulesOfLife(model))
             println("File generated successfully!") // Debug line
        }else {
            println("Model is null!") // Debug line
        }
    }
    
    def generateRulesOfLife(Model model) '''
        package GameOfLife;
        
        import java.awt.Point;
        import java.util.ArrayList;
        
        public class RulesOfLife {
            public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
                for (int i = 1; i < gameBoard.length - 1; i++) {
                    for (int j = 1; j < gameBoard[0].length - 1; j++) {
                        int surrounding = countLiveNeighbors(gameBoard, i, j);
                        boolean isAlive = gameBoard[i][j];
                        
                        «IF !model.rules.empty»
                            «val rules = model.rules.get(0)»
                            // Survival rules
                            «FOR surviveRule : rules.surviveRules»
                                if (isAlive && «generateCondition(surviveRule.neighbors, "surrounding")») {
                                    survivingCells.add(new Point(i-1, j-1));
                                }
                            «ENDFOR»
                            
                            // Birth rules  
                            «FOR birthRule : rules.birthRules»
                                if (!isAlive && «generateCondition(birthRule.neighbors, "surrounding")») {
                                    survivingCells.add(new Point(i-1, j-1));
                                }
                            «ENDFOR»
                        «ELSE»
                            // Default Conway rules
                            if (isAlive && (surrounding == 2 || surrounding == 3)) {
                                survivingCells.add(new Point(i-1, j-1));
                            } else if (!isAlive && surrounding == 3) {
                                survivingCells.add(new Point(i-1, j-1));
                            }
                        «ENDIF»
                    }
                }
            }
            
            private static int countLiveNeighbors(boolean[][] gameBoard, int x, int y) {
                int count = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i == 0 && j == 0) continue;
                        if (gameBoard[x + i][y + j]) {
                            count++;
                        }
                    }
                }
                return count;
            }
            
            // Initial grid configuration
            public static boolean[][] getInitialGrid() {
                boolean[][] grid = new boolean[50][50]; // Default size
                «FOR gridConfig : model.grids»
                    // Grid: «gridConfig.name»
                    «FOR cell : gridConfig.liveCells»
                        if («cell.x» < grid.length && «cell.y» < grid[0].length) {
                            grid[«cell.x»][«cell.y»] = true;
                        }
                    «ENDFOR»
                «ENDFOR»
                return grid;
            }
        }
    '''
    
    def generateCondition(NeighborCondition condition, String varName) {
    if (condition.range !== null) {
        val min = Integer.valueOf(condition.range.min)
        val max = Integer.valueOf(condition.range.max)
        '''«varName» >= «min» && «varName» <= «max»'''
    } else {
        val count = Integer.valueOf(condition.count)
        '''«varName» == «count»'''
    }
}
}