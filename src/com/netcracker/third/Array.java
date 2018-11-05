package com.netcracker.third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Array {
    static {
        System.out.println();
        System.out.println("tasks for one-dimensional arrays");
        System.out.println();
    }

    public void doA() {
        List <Integer> arrList = new ArrayList<>();

        for(int i = 1; i <= 99; i++) {
            if(i % 2 != 0) {
                arrList.add(i);
            }
        }
        System.out.println(arrList);

        Collections.reverse(arrList);
        System.out.println(arrList);
    }

    public void doB() {
        int[] array = new int[20];
        int even = 0;
        int notEven = 0;

        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt(11);
        }

        printArr(array);

        for(int i : array) {
            if(i % 2 == 0) {
                ++even;
            }
            else {
                ++notEven;
            }
        }

        System.out.println("Number of even--> " + even);
        System.out.println("Number of notEven--> " + notEven);

    }

    public void doC() {
        int[] array = new int[10];

        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt(100)+1;
        }

        printArr(array);

        for (int i = 0; i <= array.length - 1; i++) {
            if(i % 2 != 0) {
                array[i] = 0;
            }
        }
        printArr(array);
    }

    public void doD() {
        int[] array = new int[15];


        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt() % 51;
        }
        printArr(array);

        int max = array[0];
        int maxIndex = 0;
        int min = array[0];
        int minIndex = 0;

        for(int i = 1; i <= array.length - 1; i++) {
            if(array[i] > max) {
                max = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }
        }

        for(int i = 0; i <= array.length - 1; i++) {
            if(array[i] == max) {
                maxIndex = i;
            }
            else if(array[i] == min) {
                minIndex = i;
            }
        }

        System.out.println("max (index)--> " + max+ " ("+ maxIndex + ")" + ", min (index)--> " + min + " ("+ minIndex + ")");
    }

    public void doE() {
        int sum = 0;
        int length = 10;
        int[] arr1 = new int[length];
        float avg1 = 0.0f;

        int[] arr2 = new int[length];
        float avg2 = 0.0f;

        for(int i = 0; i <= length - 1; i++) {
            arr1[i] = new Random().nextInt(11);
            arr2[i] = new Random().nextInt(11);
        }

        printArr(arr1);
        printArr(arr2);

        for(int n : arr1) {
            sum += n;
        }
        avg1 = (float)sum / (float)arr1.length;

        sum = 0;

        for(int n : arr2) {
            sum += n;
        }

        avg2 = (float)sum / (float)arr2.length;
        System.out.println("avg1-->" + avg1);
        System.out.println("avg2-->" + avg2);

        if(avg1 == avg2) {
            System.out.println("Average of arr1 = average of arr2");
        }
        else if(avg1 > avg2) {
            System.out.println("Average of arr1 > average of arr2");
        }
        else {
            System.out.println("Average of arr1 < average of arr2");
        }

    }

    public void doF() {
        int[] array = new int[20];

        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt() % 2;
        }
        printArr(array);

        int a = 0; //-1
        int b = 0; //0
        int c = 0; //1

        for(int n : array) {
            switch (n) {
                case -1 : ++a; break;
                case 0 : ++b; break;
                case 1 : ++c; break;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if(a > b & a > c) {
            System.out.println("-1");
        }
        else if(b > a & b > c) {
            System.out.println("0");
        }
        else if(c > a & c > b) {
            System.out.println("1");
        }
        if (a == b) {
            System.out.println("-1 and 0");
        }
        if (a == c) {
            System.out.println("-1 and 1");
        }
        if (b == c) {
            System.out.println("0 and 1");
        }
        if (a == b & b == c) {
            System.out.println("-1 and 0 and 1");
        }
    }



    private void printArr(int[] arr) {
        String str = new String("Current array--> [");
        for (int i = 0; i <= arr.length - 1; i++) {
            if(i < arr.length - 1) {
                str += arr[i] + ", ";
            }
            else {
                str += arr[i] +"]";
            }
        }

        System.out.println(str);
    }

}
