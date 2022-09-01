/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.vinicius.ex7;

/**
 *
 * @author vinicius.poliveira14
 */
public class Init7 {
    private int[][] matrix;
    
    private void handleSetMatrix() {
        int[][] newMatrix =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        this.matrix = newMatrix;
    }
    
    public void main() {
        this.handleSetMatrix();
    }
    
    public boolean checkIsPerfectSquare(int[][] matrixToCompare) {
        if(!this.checkIsSquareMatrix(matrixToCompare)) return false;
        
        int rows = matrixToCompare.length;
        int columns = matrixToCompare[0].length;
        
        boolean isPerfectSquare = true;
        
        for (int actualRow = 0; actualRow < rows; actualRow ++) {
            for (int actualColumn = 0; actualColumn < rows; actualColumn ++) {
                
            } 
        }
    }
    
    private boolean checkIsSquareMatrix(int[][] matrixToCompare) {
        int rows = matrixToCompare.length;
        int columns = matrixToCompare[0].length;
        
        return rows == columns;
    }
}
