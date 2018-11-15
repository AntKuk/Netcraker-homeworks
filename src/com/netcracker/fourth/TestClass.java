package com.netcracker.fourth;

import java.util.*;

public class TestClass {
    private int size;
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();

    private Set<Integer> hashSet = new HashSet<>();
    private Set<Integer> linkedHashSet = new LinkedHashSet<>();
    private Set<Integer> treeSet = new TreeSet<>();

    private Map<Integer, String> hashMap = new HashMap<>();
    private Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    private Map<Integer, String> treeMap = new TreeMap<>();

    public TestClass() {
        this(10000);
    }

    public TestClass(int size) {
        this.size = size;
        fillCollections();

    }

    private void fillCollections() {
        for(Integer i = 0; i <= this.size - 1; i++) {
            arrayList.add(new Random().nextInt());
            linkedList.add(new Random().nextInt());

            hashSet.add(new Random().nextInt());
            linkedHashSet.add(new Random().nextInt());
            treeSet.add(new Random().nextInt());

            hashMap.put(new Random().nextInt(), Integer.toString(i));
            linkedHashMap.put(new Random().nextInt(), Integer.toString(i));
            treeMap.put(new Random().nextInt(), Integer.toString(i));

        }
    }

    public void addToMiddle() {
        System.out.println("addToMiddle Time");
        long startTime = System.nanoTime();
        arrayList.add(size/2, 1111111);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(arrayList.getClass().getName() +"-->" + estimatedTime);

        long startTime1 = System.nanoTime();
        linkedList.add(size/2, 1111111);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(linkedList.getClass().getName() +"-->" + estimatedTime1);

        hashSet.remove(size/2);

        long startTime2 = System.nanoTime();
        hashSet.add(size/2);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(hashSet.getClass().getName() +"-->" + estimatedTime2);

        linkedHashSet.remove(size/2);

        long startTime3 = System.nanoTime();
        linkedHashSet.add(size/2);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(linkedHashSet.getClass().getName() +"-->" + estimatedTime3);

        treeSet.remove(size/2);

        long startTime4 = System.nanoTime();
        treeSet.add(size/2);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println(treeSet.getClass().getName() +"-->" + estimatedTime4);

        hashMap.remove(size/2);

        long startTime5 = System.nanoTime();
        hashMap.put(size/2, "TEST");
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println(hashMap.getClass().getName() +"-->" + estimatedTime5);

        linkedHashMap.remove(size/2);

        long startTime6 = System.nanoTime();
        linkedHashMap.put(size/2, "TEST");
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println(linkedHashMap.getClass().getName() +"-->" + estimatedTime6);

        treeMap.remove(size/2);

        long startTime7 = System.nanoTime();
        treeMap.put(size/2, "TEST");
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println(treeMap.getClass().getName() +"-->" + estimatedTime7);

    }

    public void addLast() {
        System.out.println();
        System.out.println("addLast Time");
        System.out.println();

        long startTime = System.nanoTime();
        arrayList.add( 1111111);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(arrayList.getClass().getName() +"-->" + estimatedTime);

        long startTime1 = System.nanoTime();
        linkedList.add(1111111);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(linkedList.getClass().getName() +"-->" + estimatedTime1);


        long startTime2 = System.nanoTime();
        hashSet.add(size);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(hashSet.getClass().getName() +"-->" + estimatedTime2);


        long startTime3 = System.nanoTime();
        linkedHashSet.add(size);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(linkedHashSet.getClass().getName() +"-->" + estimatedTime3);

        long startTime4 = System.nanoTime();
        treeSet.add(size);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println(treeSet.getClass().getName() +"-->" + estimatedTime4);

        long startTime5 = System.nanoTime();
        hashMap.put(size, "TEST");
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println(hashMap.getClass().getName() +"-->" + estimatedTime5);

        long startTime6 = System.nanoTime();
        linkedHashMap.put(size, "TEST");
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println(linkedHashMap.getClass().getName() +"-->" + estimatedTime6);

        long startTime7 = System.nanoTime();
        treeMap.put(size, "TEST");
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println(treeMap.getClass().getName() +"-->" + estimatedTime7);


    }

    public void removeMiddle() {
        System.out.println();
        System.out.println("removeMiddle Time");
        System.out.println();

        long startTime = System.nanoTime();
        arrayList.remove(size/2);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(arrayList.getClass().getName() +"-->" + estimatedTime);

        long startTime1 = System.nanoTime();
        linkedList.remove(size/2);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(linkedList.getClass().getName() +"-->" + estimatedTime1);

        long startTimeR = System.nanoTime();
        hashSet.remove(size/2);
        long estimatedTimeR = System.nanoTime() - startTimeR;
        System.out.println("Remove " + hashSet.getClass().getName() +"-->" + estimatedTimeR);

        long startTimeR1 = System.nanoTime();
        linkedHashSet.remove(size/2);
        long estimatedTimeR1 = System.nanoTime() - startTimeR1;
        System.out.println("Remove " + linkedHashSet.getClass().getName() +"-->" + estimatedTimeR1);

        long startTimeR2 = System.nanoTime();
        treeSet.remove(size/2);
        long estimatedTimeR2 = System.nanoTime() - startTimeR2;
        System.out.println("Remove " + treeSet.getClass().getName() +"-->" + estimatedTimeR2);

        long startTime5 = System.nanoTime();
        hashMap.remove(size/2);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println(hashMap.getClass().getName() +"-->" + estimatedTime5);

        long startTime6 = System.nanoTime();
        linkedHashMap.remove(size/2);
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println(linkedHashMap.getClass().getName() +"-->" + estimatedTime6);

        long startTime7 = System.nanoTime();
        treeMap.remove(size/2);
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println(treeMap.getClass().getName() +"-->" + estimatedTime7);
    }


}
