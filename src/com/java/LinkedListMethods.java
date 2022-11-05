package com.java;

public class LinkedListMethods {
    Node head;
    public void append(int data){
        Node node=new Node();
        node.data=data;

        if(head==null){
            head=node;
        }
        else {
            Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

        }
    }
    public void display(){
        Node node = head;
        while(node.next!=null) {
            System.out.println(node.data);
        }
        System.out.println(node.data);// the while loop will check till next!=null, when next gets equal to null it exits without printing the data but i need that data so i am printing that data outside the loop
    }
}
