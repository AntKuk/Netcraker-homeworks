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
        for(int i = 0; i <= this.size - 1; i++) {
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

    public void analyzeAdding() {
        System.out.println();
        System.out.println("Add Times:");
        System.out.println();

        analyzeAdd(arrayList);
        analyzeAdd(linkedList);

        analyzeAdd(hashSet);
        analyzeAdd(linkedHashSet);
        analyzeAdd(treeSet);

        analyzeAdd(hashMap);
        analyzeAdd(linkedHashMap);
        analyzeAdd(treeMap);

    }

    private void analyzeAdd(List l) {
        long startTime = System.nanoTime();
        l.add(size/2, 1111111);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(l.getClass().getName() +" add to middle -->" + estimatedTime);

        startTime  = System.nanoTime();
        l.add(2222222);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(l.getClass().getName() +" add to end -->" + estimatedTime);

    }

    private void analyzeAdd(Set s) {

        long startTime  = System.nanoTime();
        s.add(1111111);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("insert into Set " + s.getClass().getName() +" -->" + estimatedTime);
    }

    private void analyzeAdd(Map m) {

        long startTime  = System.nanoTime();
        m.put(1111111, "TEST");
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("insert into Map " + m.getClass().getName() +" -->" + estimatedTime);
    }


    public void analyzeRemoving() {
        System.out.println();
        System.out.println("Remove Times:");
        System.out.println();

        analyzeRemove(arrayList);
        analyzeRemove(linkedList);

        analyzeRemove(hashSet);
        analyzeRemove(linkedHashSet);
        analyzeRemove(treeSet);

        analyzeRemove(hashMap);
        analyzeRemove(linkedHashMap);
        analyzeRemove(treeMap);

    }

    private void analyzeRemove(Collection c) {

        long startTime = System.nanoTime();
        c.remove(1111111);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(c.getClass().getName() +"-->" + estimatedTime);
    }

    private void analyzeRemove(Map m) {
        long startTime = System.nanoTime();
        m.remove(1111111);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(m.getClass().getName() +"-->" + estimatedTime);
    }


}
