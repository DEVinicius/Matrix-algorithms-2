/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.vinicius.ex4;

/**
 *
 * @author vinicius.poliveira14
 */
public class Init4 {
    private int[][] matrix;
    
    private void handleSetMatrix() {
        int[][] newMatrix =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        this.matrix = newMatrix;
    }
    
    public void main() {
        this.handleSetMatrix();
        boolean isSquareMatrix = this.checkIsSquareMatrix(this.matrix);
        
        System.out.println(isSquareMatrix ? "Eh Matriz Quadrada" : "Nao eh matriz quadrada");
    }
    
    private boolean checkIsSquareMatrix(int[][] matrixToCompare) {
        int rows = matrixToCompare.length;
        int columns = matrixToCompare[0].length;
        
        return rows == columns;
    }
}
