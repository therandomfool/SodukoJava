package sudoku.computationlogic;

import sudoku.problemdomain.SudokuGame;

public class SudokuUtilities {
    public static void copySudokuArrayValues(int[][] oldArray, int [][] newArray) {
        for(int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDRY; xIndex++){
            for(int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDRY; yIndex++){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }

    public static int [][] copyToNewArray(int [][] oldArray) {
        int [][] newArray = new int[SudokuGame.GRID_BOUNDRY][SudokuGame.GRID_BOUNDRY];

        for(int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDRY; xIndex++){
            for(int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDRY; yIndex++){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
        return newArray;
    }
}

