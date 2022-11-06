package com.java;

import java.util.Collections;
import java.util.LinkedList;

public class SortedLinkedList {
    LinkedList<Integer> list = new LinkedList<>();

    public void sort() {
        System.out.println("\n============================UC10========================\n");
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        Collections.sort(list); // sorts in ascending order
        System.out.println("Sorted in ascending order : "+list);

    }

    }

