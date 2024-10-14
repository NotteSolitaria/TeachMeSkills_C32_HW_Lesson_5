/**
 * Create two arrays of integers (two matrices).
 * Write a program to multiply two matrices.
 */

package com.teachmeskills.lesson5;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        int[][] array1 = new int[][]{{1,0,0,0},{0,1,0,0},{0,0,0,0}};

        int[][] array2 = new int[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int[][] resultOfMultiple = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    resultOfMultiple[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(resultOfMultiple));
    }
}
