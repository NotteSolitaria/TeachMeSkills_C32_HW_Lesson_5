/**
 * Create a two-dimensional array of integers. Print the amount to the console
 * all elements of the array.
 */

package com.teachmeskills.lesson5;

public class Task_3 {
    public static void main(String[] args) {

        int[][] array = new int[3][3];

        int numberInArray = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = numberInArray;
                numberInArray++;
            }
        }

        int sumOfArray = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumOfArray = sumOfArray + array[i][j];
            }
        }

        System.out.println(sumOfArray);
    }
}
