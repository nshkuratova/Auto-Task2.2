package com.nika.speedtest;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by nika.shkuratova on 12.03.2017.
 */
public class SetComparator {
    private SetComparator() {
    }

    public static void compareLists() {

        long start;
        long finish;

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("\n~~~~~~~~~~~~~~~Comparing HashSet and TreeSet~~~~~~~~~~~~~~~");
        System.out.println("\n--- Adding " + Utils.ITERATION_COUNT + " elements");

        System.out.print("HashSet: ");
        start = Utils.getCurrentTime();
        Utils.addElementsToCollection(hashSet);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("TreeSet: ");
        start = Utils.getCurrentTime();
        Utils.addElementsToCollection(treeSet);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.println("\n--- Searching for elements");

        System.out.print("HashSet: ");
        start = Utils.getCurrentTime();
        Utils.findElementsInCollection(hashSet);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("TreeSet: ");
        start = Utils.getCurrentTime();
        Utils.findElementsInCollection(treeSet);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.println("\n--- Removing " + Utils.ITERATION_COUNT + " elements");

        System.out.print("HashSet: ");
        start = Utils.getCurrentTime();
        Utils.removeElementsFromCollection(hashSet);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("TreeSet: ");
        start = Utils.getCurrentTime();
        Utils.removeElementsFromCollection(treeSet);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);
    }
}
