package com.nika.speedtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Date start;
        Date finish;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        System.out.println("~~~~~~~~~~~~~~~Comparing ArrayList and LinkedList~~~~~~~~~~~~~~~");
        System.out.println("\n--- Adding 1,000,000 elements");
        System.out.print("ArrayList: ");

        start = new Date();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        finish = new Date();
        timeCounter(start, finish);

        System.out.print("LinkedList: ");

        start = new Date();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        finish = new Date();
        timeCounter(start, finish);

        System.out.println("\n--- Searching for elements");
        int seachString = 999541;
        boolean found = false;
        System.out.print("ArrayList: ");

        start = new Date();

        for (Integer value : arrayList) {
            if (seachString == value) {
                found = true;
            }
            if (found) {
                break;
            }
        }

        finish = new Date();
        timeCounter(start, finish);

        System.out.print("LinkedList: ");
        found = false;

        for (Integer value : linkedList) {
            if (seachString == value) {
                found = true;
            }
            if (found) {
                break;
            }
        }

        finish = new Date();
        timeCounter(start, finish);

        System.out.println("\n--- Removing 1,000,000 elements from the end");
        System.out.print("ArrayList: ");

        start = new Date();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        finish = new Date();
        timeCounter(start, finish);

        System.out.print("LinkedList: ");

        start = new Date();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        finish = new Date();
        timeCounter(start, finish);


    }

    static void timeCounter(Date start, Date end) {
        System.out.println(end.getTime() - start.getTime() + "ms");
    }
}
