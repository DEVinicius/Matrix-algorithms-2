/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.vinicius.ex2;

/**
 *
 * @author vinicius.poliveira14
 */
public class InitEx2 {
    private int[][] matrix;
    
    private void handleSetMatrix() {
        int[][] newMatrix = {{1, 2}, {3, 4}, {5, 6}};
        this.matrix = newMatrix;
    }
    
    public void main() {
        this.handleSetMatrix();
        int highestValue = this.searchHighestValue(this.matrix);
        
        System.out.println("O maior valor dessa Matriz eh: " + highestValue);
    }
    
    private int searchHighestValue(int[][] matrixToShow) {
        int rows = matrixToShow.length;
        int columns = matrixToShow[0].length;
        
        int highestValue = matrix[0][0];
        
        for(int actualRow = 0; actualRow < rows; actualRow ++) {
            for(int actualColumn = 0; actualColumn < columns; actualColumn ++) {
                if(highestValue < matrixToShow[actualRow][actualColumn]) {
                    highestValue = matrixToShow[actualRow][actualColumn];
                }
            }
        }
        
        return highestValue;
    }
}
