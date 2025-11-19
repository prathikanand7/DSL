package gameoflife.dsl.validation

import org.eclipse.xtext.validation.Check
import gameoflife.dsl.gameOfLifeDSL.GameOfLifeDSLPackage.Literals
import gameoflife.dsl.gameOfLifeDSL.Cell
import gameoflife.dsl.gameOfLifeDSL.NeighborCondition

class GameOfLifeDSLValidator extends AbstractGameOfLifeDSLValidator {
    
    public static val INVALID_GRID_COORDINATES = "invalidGridCoordinates"
    public static val INVALID_NEIGHBOR_COUNT = "invalidNeighborCount"
    public static val DUPLICATE_CELL = "duplicateCell"
    
    @Check
    def checkCellCoordinates(Cell cell) {
        try {
            val x = Integer.valueOf(cell.x)
            val y = Integer.valueOf(cell.y)
            
            if (x < 0 || x >= 100) {
                error("X coordinate must be between 0 and 99", 
                      Literals.CELL__X,
                      INVALID_GRID_COORDINATES)
            }
            
            if (y < 0 || y >= 100) {
                error("Y coordinate must be between 0 and 99", 
                      Literals.CELL__Y,
                      INVALID_GRID_COORDINATES)
            }
        } catch (NumberFormatException e) {
            // Ignore - this shouldn't happen with proper INT grammar
        }
    }
    
    @Check
    def checkNeighborCondition(NeighborCondition condition) {
        if (condition.range !== null) {
            try {
                val min = Integer.valueOf(condition.range.min)
                val max = Integer.valueOf(condition.range.max)
                
                if (min < 0 || max > 8) {
                    error("Neighbor count range must be between 0 and 8", 
                          null,
                          INVALID_NEIGHBOR_COUNT)
                }
                if (min > max) {
                    error("Range minimum cannot be greater than maximum", 
                          null,
                          INVALID_NEIGHBOR_COUNT)
                }
            } catch (NumberFormatException e) {
                // Ignore
            }
        } else {
            try {
                val count = Integer.valueOf(condition.count)
                if (count < 0 || count > 8) {
                    error("Neighbor count must be between 0 and 8", 
                          null,
                          INVALID_NEIGHBOR_COUNT)
                }
            } catch (NumberFormatException e) {
                // Ignore
            }
        }
    }
    
    @Check
    def checkDuplicateCells(gameoflife.dsl.gameOfLifeDSL.Grid grid) {
        val seenCells = newHashMap()
        
        for (cell : grid.liveCells) {
            val key = cell.x + "," + cell.y
            if (seenCells.containsKey(key)) {
                error("Duplicate cell at (" + cell.x + ", " + cell.y + ")", 
                      null,
                      DUPLICATE_CELL)
            } else {
                seenCells.put(key, cell)
            }
        }
    }
}