/**
 * Using loops, go through the entire array and increase each
 * element for a given number. Let the number that will be
 * increase each element, set from the console.
 */

package com.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        System.out.println("Enter the number by which you want to increase the values in the array: ");

        Scanner scanner = new Scanner(System.in);
        int numberToIncrease = scanner.nextInt();

        int[][][] array = new int[4][4][4];

        int numberInArray = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = numberInArray;
                    numberInArray++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += numberToIncrease;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
