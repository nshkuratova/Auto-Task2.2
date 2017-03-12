package com.nika.speedtest;

import java.util.Collection;

/**
 * Created by nika.shkuratova on 12.03.2017.
 */
public class Utils {
    public static final int ITERATION_COUNT = 10_000;

    private Utils() {
    }

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static void timeCounter(long start, long end) {
        System.out.println(end - start + "ms");
    }

    public static void addElementsToCollection(Collection<Integer> collection) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.add(i);
        }
    }

    public static void findElementsInCollection(Collection<Integer> collection) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.contains(i);
        }
    }

    public static void removeElementsFromCollection(Collection<Integer> collection) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            collection.remove(i);
        }
    }
}


