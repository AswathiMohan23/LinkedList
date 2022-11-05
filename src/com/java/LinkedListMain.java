package com.java;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args){
        createSimpleLinkedList();
        appendingTheElements();
        addingElements();
    }

    public static void addingElements() {
        LinkedListMethods linkedListMethods=new LinkedListMethods();
        System.out.println("\nwhile adding, the new elements will get added in front " +
                "\nso required output ===> 56,30,70");
        linkedListMethods.add(70);
        linkedListMethods.add(30);
        linkedListMethods.add(56);
        linkedListMethods.display();
    }

    public static void appendingTheElements() { // new element gets added at the end
        LinkedListMethods linkedListMethods=new LinkedListMethods();
        System.out.println("while appending, the new elements will get added to the end position" +
                "\nso required output is ====> 56,30,70");
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
