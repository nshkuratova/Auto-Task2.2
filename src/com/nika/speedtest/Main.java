package com.nika.speedtest;

import java.util.*;

public class Main {

    private static final int ITERATION_COUNT = 10_000;

    public static void main(String[] args) {

        long start;
        long finish;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("~~~~~~~~~~~~~~~Comparing ArrayList and LinkedList~~~~~~~~~~~~~~~");
        System.out.println("\n--- Adding " + ITERATION_COUNT + " elements");

        System.out.print("ArrayList: ");
        start = getCurrentTime();
        addElements(arrayList);
        finish = getCurrentTime();
        timeCounter(start, finish);

        System.out.print("LinkedList: ");
        start = getCurrentTime();
        addElements(linkedList);
        finish = getCurrentTime();
        timeCounter(start, finish);

        System.out.println("\n--- Searching for elements");

        System.out.print("ArrayList: ");
        start = getCurrentTime();
        findElements(arrayList);
        finish = getCurrentTime();
        timeCounter(start, finish);

        System.out.print("LinkedList: ");
        start = getCurrentTime();
        findElements(linkedList);
        finish = getCurrentTime();
        timeCounter(start, finish);

        System.out.println("\n--- Removing " + ITERATION_COUNT + " elements");

        System.out.print("ArrayList: ");
        start = getCurrentTime();
        removeElements(arrayList);
        finish = getCurrentTime();
        timeCounter(start, finish);

        System.out.print("LinkedList: ");
        start = getCurrentTime();
        removeElements(linkedList);
        finish = getCurrentTime();
        timeCounter(start, finish);

    }

    private static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private static void timeCounter(long start, long end) {
        System.out.println(end - start + "ms");
    }

    private static void addElements(Collection<Integer> collection) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.add(i);
        }
    }

    private static void findElements(Collection<Integer> collection) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.contains(i);
        }
    }

    private static void removeElements(Collection<Integer> collection) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.remove(i);
        }
    }
}
