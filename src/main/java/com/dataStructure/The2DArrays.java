package com.dataStructure;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Assigning values into the 2 dimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 board[i][j] = '-';
            }
        }

        char[][] boardTwo = new char[][] {
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
                new char[]{'-','-','-'}
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        // Using the for loop to print board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n \n \n");

        // Using the for loop to print boardTwo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(boardTwo[i][j]);
            }
        }

        //System.out.println(Arrays.deepToString(board));
    }
}
