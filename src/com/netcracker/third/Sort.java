package com.netcracker.third;


import java.util.Arrays;
import java.util.Random;

public class Sort {

    static {
        System.out.println();
        System.out.println("tasks for sorting");
        System.out.println();
    }

    private int[] array;
    private int[] sortedArray;

    public Sort(Integer n) {
        this.array = new int[n];
        this.sortedArray = new int[n];
        rand();
    }

    private void rand() {
        for(int i = 0; i <= this.array.length - 1; i++) {
            this.array[i] = new Random().nextInt()%100;
        }
    }

    public void printArrs() {
        String str = new String("Current array--> [");
        for (int i = 0; i <= array.length - 1; i++) {
            if(i < array.length - 1) {
                str += array[i] + ", ";
            }
            else {
                str += array[i] +"]";
            }
        }
        System.out.println(str);

        str = new String("Sorted array--> [");
        for (int i = 0; i <= sortedArray.length - 1; i++) {
            if(i < sortedArray.length - 1) {
                str += sortedArray[i] + ", ";
            }
            else {
                str += sortedArray[i] + "]";
            }
        }
        System.out.println(str);

    }

    public void bubbleSort() {
        for(int i = 0; i <= array.length - 1; i++) {
            sortedArray[i] = array[i];
        }

        long startTime = System.nanoTime();

        for(int i = sortedArray.length - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                if(sortedArray[j - 1] > sortedArray[j]) {
                    int t = sortedArray[j];
                    sortedArray[j] = sortedArray[j - 1];
                    sortedArray[j - 1] = t;
                }
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Buuble sort time-->" + estimatedTime);
    }

    public void insertionSort() {
        for(int i = 0; i <= array.length - 1; i++) {
            sortedArray[i] = array[i];
        }
        long startTime = System.nanoTime();

        for(int i = 1; i <= sortedArray.length - 1; i++) {
            for(int j = i; j > 0 && sortedArray[j - 1] > sortedArray[j]; j--) {
                int t = sortedArray[j - 1];
                sortedArray[j - 1] = sortedArray[j];
                sortedArray[j] = t;
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Insertion sort time-->" + estimatedTime);
    }

    public void sort() {
        for(int i = 0; i <= array.length - 1; i++) {
            sortedArray[i] = array[i];
        }

        long startTime = System.nanoTime();

        Arrays.sort(sortedArray);

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("sort() from Array time-->" + estimatedTime);
    }

}
