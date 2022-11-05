package com.java;

import java.util.LinkedList;

public class LinkedListCode {
    static LinkedListMethods linkedListMethods=new LinkedListMethods();

    public static void main(String[] args){
        createSimpleLinkedList();
        appendingTheElements();
    }

    public static void appendingTheElements() {
        linkedListMethods.append(56);
        linkedListMethods.append(70);
        linkedListMethods.append(30);
        linkedListMethods.display();
    }

    public static void createSimpleLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("the simple linkedList created = " + list);
    }
    }
