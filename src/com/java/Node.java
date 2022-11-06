package com.java;

public class Node {
    int data;
    Node next;
    private int key;
    private int nodeValue;
    public Node() {}

    public Node(int key, int nodeValue) {
        this.key = key;
        this.nodeValue = nodeValue;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
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

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }
}
