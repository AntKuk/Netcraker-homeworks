package com.netcracker.fourth;
import com.netcracker.first.MyPoint;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(2,66);


        System.out.println(list.get(2));
        System.out.println(list.remove(4));
        System.out.println(list.indexOf(13));
        list.set(3, 77);
        Object[] array = list.toArray();
        for(Object obj : array) {
            System.out.println(obj);
        }

        for(Integer n : list) {
            System.out.println(n);
        }

        list.clear();

        MyLinkedList<MyPoint> list1 = new MyLinkedList<>();
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(1,2);
        MyPoint p3 = new MyPoint(1,3);
        MyPoint p4 = new MyPoint(1,2);
        System.out.println(p1.equals(p3));

        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        System.out.println(list1.toString());

        System.out.println(list1.indexOf(p3));


        MyLinkedList<Integer> myTestList = new MyLinkedList<>();
        List<Integer> javaTestList = new LinkedList<>();

        myTestList.add(1);
        long startTime = System.nanoTime();
        myTestList.add(2);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("myAdd()-->" + estimatedTime);
        myTestList.clear();

        javaTestList.add(1);
        long startTime1 = System.nanoTime();
        javaTestList.add(2);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("javaAdd()-->" + estimatedTime1);

        javaTestList.clear();


        for(int i = 1; i <= 10000; i++) {
            myTestList.add(i);
            javaTestList.add(i);
        }

        long startTime2 = System.nanoTime();
        myTestList.add(4030, new Integer(666));
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("myAddIndex()-->" + estimatedTime2);

        long startTime3 = System.nanoTime();
        javaTestList.add(4030, new Integer(666));
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("javaAddIndex()-->" + estimatedTime3);

        long startTime4 = System.nanoTime();
        myTestList.indexOf(666);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("myIndexOf()-->" + estimatedTime4);

        long startTime5 = System.nanoTime();
        javaTestList.indexOf(666);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("javaIndexOf()-->" + estimatedTime5);


        System.out.println();
        System.out.println("Testing Java Collections");
        System.out.println();

        TestClass test = new TestClass(1000000);
        test.addToMiddle();
        test.addLast();
        test.removeMiddle();
    }
}
