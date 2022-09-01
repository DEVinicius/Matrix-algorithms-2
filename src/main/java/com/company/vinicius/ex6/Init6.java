/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.vinicius.ex6;

/**
 *
 * @author vinicius.poliveira14
 */
public class Init6 {
    private int[][] matrixA;
    private int[][] matrixB;
    
    private void handleSetMatrix() {
        int[][] newMatrixA =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newMatrixB =  {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        
        this.matrixA = newMatrixA;
        this.matrixB = newMatrixB;
    }
    
    public void main() {
       this.handleSetMatrix();
       int[][] sumMatrix = this.sumMatrix(this.matrixA, this.matrixB);
       this.showMatrix(sumMatrix);
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
    
    private int[][] sumMatrix(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        
        int[][] matrixC = new int[rows][columns];
        
        for(int actualRow = 0; actualRow < rows; actualRow ++) {
            for (int actualColumn = 0; actualColumn < columns; actualColumn ++) {
                matrixC[actualRow][actualColumn] = matrixA[actualRow][actualColumn] * matrixB[actualRow][actualColumn];
            }
        }
        
        return matrixC;
    }
}
