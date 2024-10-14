/**
 * Create a program to color a chessboard using a loop.
 * Create a two-dimensional 8x8 array of Strings. Using loops to set
 * cycle elements have the values B(Black) or W(White).
 */

package com.teachmeskills.lesson5;

public class Task_1 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        String black = "B";
        String white = "W";

        for (int i = 0; i < array.length; i += 2) {
            for (int j = 0; j < array.length; j += 2) {
                array[j][i] = white;
            }
        }
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < array.length; j += 2) {
                array[j][i] = black;
            }
        }

        for (int i = 0; i < array.length; i += 2) {
            for (int j = 1; j < array.length; j += 2) {
                array[j][i] = black;
            }
        }
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 1; j < array.length; j += 2) {
                array[j][i] = white;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
