package com.nika.speedtest;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by nika.shkuratova on 12.03.2017.
 */
public class ListComparator {
    private ListComparator() {
    }

    public static void compareLists() {

        long start;
        long finish;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("~~~~~~~~~~~~~~~Comparing ArrayList and LinkedList~~~~~~~~~~~~~~~");
        System.out.println("\n--- Adding " + Utils.ITERATION_COUNT + " elements");

        System.out.print("ArrayList: ");
        start = Utils.getCurrentTime();
        Utils.addElementsToCollection(arrayList);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("LinkedList: ");
        start = Utils.getCurrentTime();
        Utils.addElementsToCollection(linkedList);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.println("\n--- Searching for elements");

        System.out.print("ArrayList: ");
        start = Utils.getCurrentTime();
        Utils.findElementsInCollection(arrayList);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("LinkedList: ");
        start = Utils.getCurrentTime();
        Utils.findElementsInCollection(linkedList);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.println("\n--- Removing " + Utils.ITERATION_COUNT + " elements");

        System.out.print("ArrayList: ");
        start = Utils.getCurrentTime();
        Utils.removeElementsFromCollection(arrayList);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

        System.out.print("LinkedList: ");
        start = Utils.getCurrentTime();
        Utils.removeElementsFromCollection(linkedList);
        finish = Utils.getCurrentTime();
        Utils.timeCounter(start, finish);

    }


}
