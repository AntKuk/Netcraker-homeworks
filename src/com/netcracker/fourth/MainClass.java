package com.netcracker.fourth;
import com.netcracker.first.MyPoint;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        testMyClassMethods();
        System.out.println();

        MyLinkedList<Integer> myTestList = new MyLinkedList<>();
        List<Integer> javaTestList = new LinkedList<>();

        for(int i = 1; i <= 10000; i++) {
            myTestList.add(i);
            javaTestList.add(i);
        }

        analyzeAdding(myTestList, javaTestList);
        analyzeSearching(myTestList, javaTestList);
        analyzeDeleting(myTestList, javaTestList);

        System.out.println();
        System.out.println("Testing Java Collections");

        TestClass test = new TestClass(10000);
        test.analyzeAdding();
        test.analyzeRemoving();
    }

    private static void testMyClassMethods() {
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
    }

    private static void analyzeAdding(MyLinkedList myList, List list) {
        long startTime = System.nanoTime();
        myList.add(new Integer(1111111));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("myAdd() Time --> " + estimatedTime);

        startTime = System.nanoTime();
        list.add(new Integer(1111111));
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("javaAdd() Time --> " + estimatedTime);

    }

    private static void analyzeSearching(MyLinkedList myList, List list) {
        long startTime = System.nanoTime();
        myList.indexOf(5000);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("myIndexOf() Time -->" + estimatedTime);

        startTime = System.nanoTime();
        list.indexOf(5000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("javaIndexOf() Time -->" + estimatedTime);
    }

    private static void analyzeDeleting(MyLinkedList myList, List list) {
        long startTime = System.nanoTime();
        myList.remove(5005);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("myRemove() Time -->" + estimatedTime);

        startTime = System.nanoTime();
        list.remove(5005);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("javaRemove() Time -->" + estimatedTime);
    }


}
