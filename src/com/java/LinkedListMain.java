package com.java;

import java.io.FilterOutputStream;
import java.util.LinkedList;

public class LinkedListMain {
    static LinkedList<Integer> simpleLinkedList=new LinkedList<>();

    public static void main(String[] args){
        createSimpleLinkedList();
        appendingTheElements();
        addingElements();
        insertingData();
        pushData();
        popFirstData();
        popLastData();
        searchNode();

    }


    public static void createSimpleLinkedList() {
        simpleLinkedList.add(56);
        simpleLinkedList.add(30);
        simpleLinkedList.add(70);
        System.out.println("\n\n===================UC1=====================\n");
        System.out.println("the simple linkedList created = " + simpleLinkedList);
    }
    public static void addingElements() {
        System.out.println("\n==============================UC2============================");
        System.out.println("\nwhile adding, the new elements will get added in front " +
                "\nso required output ===> 56,30,70");
        LinkedListMethods linkedListMethods=new LinkedListMethods();
        linkedListMethods.add(70);
        linkedListMethods.add(30);
        linkedListMethods.add(56);
        linkedListMethods.display();
    }

    public static void appendingTheElements() { // new element gets added at the end
        System.out.println("\n==============================UC3============================");
        LinkedListMethods linkedListMethods=new LinkedListMethods();
        System.out.println("while appending, the new elements will get added to the end position" +
                "\nso required output is ====> 56,30,70");
        linkedListMethods.append(56);
        linkedListMethods.append(30);
        linkedListMethods.append(70);
        linkedListMethods.display();

    }

    public static void insertingData() {
        LinkedListMethods linkedListMethods=new LinkedListMethods();
        linkedListMethods.add(56);
        linkedListMethods.append(70);
        linkedListMethods.insert(1,30);
        System.out.println("\n=================UC4==================");
        System.out.println("inserting 30 between 56 and 70");
        linkedListMethods.display();
        System.out.println("=========================================\n");

    }
    public static void pushData() {
        System.out.println("pushing the elements 56,30 and 70 ");
        Stack stack=new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.DisplayStack();
    }

    public static void popFirstData() {//input 56,30,70
        Stack stack=new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("data is : ");
        stack.DisplayStack();
        System.out.println("================== UC5 ==================");
        System.out.println("required output sequence (after deleting first element ) ==> 30,70");
        System.out.println("Pop value is : "+stack.popFirstElement());
        System.out.println("=============================================================\n");
    }
    public static void popLastData() {//input 56,30,70
        Stack stack=new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("================== UC5 ==================");
        System.out.println("data is : ");
        stack.DisplayStack();
        System.out.println("required output sequence (after deleting first element ) ==> 30,70");
        System.out.println("Pop value is : "+stack.popLastElement());
    }
    public static void searchNode(){ //method to search a node with a particular key value
        int result = 0;
        System.out.println("===============================UC7==============================\n");
        //a linked list named simpleLinkedList has been already created for first uc for the method createSimpleLinkedList
        int element=30;
        System.out.println("list is : +"+simpleLinkedList);
        System.out.println("key 0 is  : "+simpleLinkedList.get(0)+"\nkey 1 is : "+simpleLinkedList.get(1)+"\nkey 2 is : "+simpleLinkedList.get(2));
        for(int i=0;i<simpleLinkedList.size();i++) {
            int key =simpleLinkedList.get(i);
            if (key == element) {
                 result = i;
                System.out.println("key 30 corresponds to node : "+result);
            }
        }
        }
}
