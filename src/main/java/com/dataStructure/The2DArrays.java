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
            //System.out.println("\n");
        }

        System.out.println(Arrays.deepToString(board));
    }
}
