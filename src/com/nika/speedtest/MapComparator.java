package com.nika.speedtest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nika.shkuratova on 12.03.2017.
 */
public class MapComparator {
    private MapComparator() {
    }

    public static void compareMaps() {
        long start;
        long finish;

        System.out.println("\n~~~~~~~~~~~~~~~Comparing HashMap and TreeMap~~~~~~~~~~~~~~~");

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("\n--- Adding " + Utils.ITERATION_COUNT + " elements");

        System.out.print("HashMap: ");
        start = Utils.getCurrentTime();
        addElementsToMap(hashMap);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("TreeMap: ");
        start = Utils.getCurrentTime();
        addElementsToMap(treeMap);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.println("\n--- Searching for elements");

        System.out.print("HashMap: ");
        start = Utils.getCurrentTime();
        findElementsInMap(hashMap);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("TreeMap: ");
        start = Utils.getCurrentTime();
        findElementsInMap(treeMap);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.println("\n--- Removing " + Utils.ITERATION_COUNT + " elements");

        System.out.print("HashMap: ");
        start = Utils.getCurrentTime();
        removeElementsFromMap(hashMap);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("TreeMap: ");
        start = Utils.getCurrentTime();
        removeElementsFromMap(treeMap);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);
    }


    private static void addElementsToMap(Map<Integer, Integer> map) {
        for (int i = 0; i < Utils.ITERATION_COUNT; i++) {
            map.put(i, i);
        }
    }

    private static void findElementsInMap(Map<Integer, Integer> map) {
        for (int i = 0; i < Utils.ITERATION_COUNT; i++) {
            map.containsKey(i);
        }
    }

    private static void removeElementsFromMap(Map<Integer, Integer> map) {
        for (int i = 0; i < Utils.ITERATION_COUNT; i++) {
            map.remove(i);
        }
    }

}
