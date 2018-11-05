package com.netcracker.third;
import com.netcracker.third.Sort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int n = 1000;

        Sort sort = new Sort(n);
        sort.bubbleSort();
        sort.insertionSort();
        sort.sort();

        Factorial f = new Factorial();

        long startTime = System.nanoTime();
        f.loopFactor(10);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Loop factorial time-->" + estimatedTime);

        long startTime1 = System.nanoTime();
        f.recFactor(10);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Recursion factorial time-->" + estimatedTime1);


        Shapes shape = new Shapes();
        shape.drawRectangle();
        shape.drawTriangle();


        Array a1 = new Array();
        a1.doA();
        a1.doB();
        a1.doC();
        a1.doD();
        a1.doE();
        a1.doF();


        MultiArray ma1 = new MultiArray();
        ma1.doA();
        ma1.doB();
        ma1.doC();
        ma1.doD();


        CtrlStruct ctrlStr = new CtrlStruct();

        long startTime2 = System.nanoTime();
        ctrlStr.enumIfElse();
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Enum if-else time-->" + estimatedTime2);

        long startTime3 = System.nanoTime();
        ctrlStr.enumSwitchCase();
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("Enum switch-case time-->" + estimatedTime3);



        long startTime4 = System.nanoTime();
        ctrlStr.arrIfElse();
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("Array if-else time-->" + estimatedTime4);

        long startTime5 = System.nanoTime();
        ctrlStr.arrSwitchCase();
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("Array switch-case time-->" + estimatedTime5);
    }
}
