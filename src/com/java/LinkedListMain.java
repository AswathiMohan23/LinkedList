package com.java;

import java.util.LinkedList;

public class LinkedListMain {
    static LinkedList<Integer> simpleList = new LinkedList<>();
    static LinkedListMethods linkedListMethodsAppend = new LinkedListMethods();

    public static void main(String[] args) {
        createSimpleLinkedList();
        appendingTheElements(); // using flag here to use the same method for uC8
        addingElements();
        insertingData();
        pushData();
        popFirstData();
        popLastData();
        searchNode();
        insertingAfterElement();
        deleteAndShowSize();//pop
        sortInAscendingOrder();
    }

    public static void sortInAscendingOrder() {
        SortedLinkedList sortedLinkedList=new SortedLinkedList();
        sortedLinkedList.sort();
    }

    public static void createSimpleLinkedList() {
        simpleList.add(56);
        simpleList.add(30);
        simpleList.add(70);
        System.out.println("\n\n===================UC1=====================\n");
        System.out.println("the simple linkedList created = " + simpleList);
    }

    public static void addingElements() {
        System.out.println("\n==============================UC2============================");
        System.out.println("\nwhile adding, the new elements will get added in front " +
                "\nso required output ===> 56,30,70");
        LinkedListMethods linkedListMethods = new LinkedListMethods();
        linkedListMethods.add(70);
        linkedListMethods.add(30);
        linkedListMethods.add(56);
        linkedListMethods.display();
    }

    public static void appendingTheElements() { // new element gets added at the end
        System.out.println("\n==============================UC3============================");
        LinkedListMethods linkedListMethods = new LinkedListMethods();
        System.out.println("while appending, the new elements will get added to the end position" +
                "\nso required output is ====> 56,30,70");
        linkedListMethodsAppend.append(56);
        linkedListMethodsAppend.append(30);
        linkedListMethodsAppend.append(70);
        linkedListMethodsAppend.display();
    }

    public static void insertingData() {
        LinkedListMethods linkedListMethods = new LinkedListMethods();
        linkedListMethods.add(56);
        linkedListMethods.append(70);
        linkedListMethods.insert(1, 30);
        System.out.println("\n=================UC4==================");
        System.out.println("inserting 30 between 56 and 70");
        linkedListMethods.display();
        System.out.println("=========================================\n");

    }

    public static void pushData() {
        System.out.println("pushing the elements 56,30 and 70 ");
        Stack stack = new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.displayStack();
    }

    public static void popFirstData() {//input 56,30,70
        Stack stack = new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("data is : ");
        stack.displayStack();
        System.out.println("================== UC5 ==================");
        System.out.println("required output sequence (after deleting first element ) ==> 30,70");
        System.out.println("Pop value is : " + stack.popFirstElement());
        System.out.println("=============================================================\n");
    }

    public static void popLastData() {//input 56,30,70
        Stack stack = new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("================== UC6 ==================");
        System.out.println("data is : ");
        stack.displayStack();
        System.out.println("required output sequence (after deleting first element ) ==> 30,70");
        System.out.println("Pop value is : " + stack.popLastElement());
    }

    public static void searchNode() {  //method to search a node with a particular key value
        int result = 0;
        System.out.println("\n===============================UC7==============================\n");
        //a linked list named simpleLinkedList has been already created for first uc for the method createSimpleLinkedList
        int element=30;
        System.out.println("list is : +" + simpleList);
        System.out.println("key 0 is  : " + simpleList.get(0) + "\nkey 1 is : " + simpleList.get(1) + "\nkey 2 is : " + simpleList.get(2));
        for (int i = 0; i < simpleList.size(); i++) {
            int key = simpleList.get(i);
            if (key == element) {
                result = i;
                System.out.println("key " + element + " corresponds to node : " + result);
            }
        }
    }
   public static void insertingAfterElement () {
       System.out.println("\n==========================================UC8===================================\n");
       System.out.println("the data is : ");
       linkedListMethodsAppend.display();// using the output of appendingTheElements method
       linkedListMethodsAppend.insert(2, 40);
       System.out.println("\nRequired output is : 56->30->40->70 \nthe index of value 30 is 1...so after inserting 40 at index 2 we get the list as :  ");
       linkedListMethodsAppend.display();
   }
   public static void deleteAndShowSize() {
        System.out.println("=====================================UC9==========================");
       Stack stack = new Stack();
       stack.push(56);
       stack.push(30);
       stack.push(40);
       stack.push(70);
       stack.displayStack();
       int size= stack.size();
       System.out.println("size : "+size);
       System.out.println("data and size after deleting element 40 \n ");
       stack.popTheElement();
       System.out.println("size : "+stack.size());

   }
}
