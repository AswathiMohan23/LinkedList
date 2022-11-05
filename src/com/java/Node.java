package com.java;

public class Node {
    int data;
    Node next;
    private int value;
    private int nodeValue;
    public Node() {}


    public int getValue() {
        return value;
    }

    public Node(int nodeValue, int value) {
        this.nodeValue = nodeValue;
        this.value = value;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }
}
