package com.netcracker.third;

import java.util.Random;

public class MultiArray {

    static {
        System.out.println();
        System.out.println("tasks for multi-dimensional arrays");
        System.out.println();
    }

    public void doA() {
        int[][] array = new int[8][8];
        int sumMain = 0;
        long mulMain = 1;
        int sumT = 0;
        long mulT = 1;

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = 0; j <= array[0].length - 1; j++) {
                array[i][j] = new Random().nextInt(99) + 1;
            }
        }

        for(int[] i : array) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = 0; j <= array[0].length - 1; j++) {
                if(i == j) {
                    sumMain += array[i][j];
                    mulMain *= (long)array[i][j];
                }
            }
        }

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = array[0].length - 1; j >= 0; j--) {
                if(j == - i + array[0].length -1) {
                    sumT += array[i][j];
                    mulT *= (long)array[i][j];
                }
            }
        }

        System.out.println("Summ of main diagonal--> " + sumMain);
        System.out.println("Multiply of main diagonal -->" + mulMain);
        System.out.println("Summ of side diagonal--> " + sumT);
        System.out.println("Multiply of side diagonal -->" + mulT);

    }

    public void doB() {
        int[][] array = new int[8][5];
        int max = 0;
        int indMaxX = 0;
        int indMaxY = 0;

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = 0; j <= array[0].length - 1; j++) {
                array[i][j] = new Random().nextInt() % 100;
            }
        }

        for(int[] i : array) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = 0; j <= array[0].length - 1; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    indMaxX = j;
                    indMaxY = i;
                }
            }
        }

        System.out.println("Max[][] --> " + max + "[" + indMaxY + "][" + indMaxX + "]");

    }

    public void doC() {
        int[][] array = new int[8][5];
        int resMult = 0;
        int subMult = 1;
        int row = -1;

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = 0; j <= array[0].length - 1; j++) {
                array[i][j] = new Random().nextInt() % 11;
            }
        }

        for(int[] i : array) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = 0; i <= array.length - 1; i++) {
            subMult = 1;
            for(int j = 0; j <= array[0].length - 1; j++) {
                subMult *= array[i][j];
            }
            if(Math.abs(subMult) > resMult) {
                resMult = Math.abs(subMult);
                row = i;
            }
        }

        System.out.println("Max multiplation-->" + resMult);
        System.out.println("Row with max mult -->" + row);
    }

    public void doD() {
        int[][] array = new int[10][7];

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = 0; j <= array[0].length - 1; j++) {
                array[i][j] = new Random().nextInt(101);
            }
        }

        for(int[] i : array) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i <= array.length - 1; i++) {
            for(int j = array[0].length - 1; j > 1; j--) {
                for(int h = 1; h <= j; h++) {
                    if(array[i][h - 1] < array[i][h]) {
                        int t = array[i][h];
                        array[i][h] = array[i][h - 1];
                        array[i][h - 1] = t;
                    }
                }
            }
        }

        for(int[] i : array) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
