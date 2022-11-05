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
}
