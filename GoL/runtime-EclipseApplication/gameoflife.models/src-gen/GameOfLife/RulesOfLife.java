package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;

public class RulesOfLife {
    public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
        for (int i = 1; i < gameBoard.length - 1; i++) {
            for (int j = 1; j < gameBoard[0].length - 1; j++) {
                int surrounding = countLiveNeighbors(gameBoard, i, j);
                boolean isAlive = gameBoard[i][j];
                
                // Default Conway rules
                if (isAlive && (surrounding == 2 || surrounding == 3)) {
                    survivingCells.add(new Point(i-1, j-1));
                } else if (!isAlive && surrounding == 3) {
                    survivingCells.add(new Point(i-1, j-1));
                }
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
        // Grid: Test
        if (1 < grid.length && 1 < grid[0].length) {
            grid[1][1] = true;
        }
        return grid;
    }
}
