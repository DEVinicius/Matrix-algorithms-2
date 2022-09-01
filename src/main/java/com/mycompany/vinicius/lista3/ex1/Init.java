/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vinicius.lista3.ex1;

/**
 *
 * @author vinicius.poliveira14
 */
public class Init {
    private int[][] matrix;
    private int[][] transposedMatrix;
    
    private void handleSetMatrix() {
        int[][] newMatrix = {{1, 2}, {3, 4}, {5, 6}};
        this.matrix = newMatrix;
    }
    
    public void main() {
        this.handleSetMatrix();
        this.handleMakeTransposedMatrix(this.matrix);
        
        System.out.println("Matriz atual");
        this.showMatrix(this.matrix);
        
        System.out.println("Matriz transposta");
        this.showMatrix(this.transposedMatrix);
    }
    
    private void handleMakeTransposedMatrix(int[][] matrix) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        
        int newMatrix[][] = new int [columns][rows];
        
        for(int actualRow = 0; actualRow < columns; actualRow ++) {
            int actualColumn = 0;
            do {
                newMatrix[actualRow][actualColumn] = matrix[actualColumn][actualRow];
                actualColumn = actualColumn + 1;
            } while(actualColumn < rows);
        }
        
        this.transposedMatrix = newMatrix;
    }
    
    private void showMatrix(int[][] matrixToShow) {
        int rows = matrixToShow.length;
        int columns = matrixToShow[0].length;
        
        for (int actualRow = 0; actualRow < rows; actualRow ++) {
            for (int actualColumn = 0; actualColumn < columns; actualColumn ++ ) {
                System.out.print(matrixToShow[actualRow][actualColumn] + "\t");
            }
            System.out.println("\n");
        }
    }
}
