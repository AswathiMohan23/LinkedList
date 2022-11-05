package com.java;

import java.util.LinkedList;

public class LinkedListMain {
    static LinkedListMethods linkedListMethods=new LinkedListMethods();

    public static void main(String[] args){
        createSimpleLinkedList();
        appendingTheElements();
    }

    public static void appendingTheElements() {
        System.out.println("\nRequired output is ====> 56,30,70");
        linkedListMethods.append(56);
        linkedListMethods.append(30);
        linkedListMethods.append(70);
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
