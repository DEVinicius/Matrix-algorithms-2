/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.vinicius.ex3;

/**
 *
 * @author vinicius.poliveira14
 */
public class Init3 {
    private int[][] matrix;
    
    private void handleSetMatrix() {
        int[][] newMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        this.matrix = newMatrix;
    }
    
    public void main() {
        this.handleSetMatrix();
        int trace = this.findMatrixTrace(this.matrix);
        
        System.out.println("Valor do Traco = " + trace);
    }
    
    private int findMatrixTrace(int[][] matrixToShow) {
        int rows = matrixToShow.length;
        int columns = matrixToShow[0].length;
        
        int trace = 0;
        
        for(int actualRow = 0; actualRow < rows; actualRow ++) {
            for (int actualColumn = 0; actualColumn < columns; actualColumn ++) {
                if(actualRow == actualColumn) {
                    trace = trace + matrixToShow[actualRow][actualColumn];
                }
            }
        }
        
        return trace;
    }
}
