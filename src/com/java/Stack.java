package com.java;

import org.w3c.dom.ls.LSOutput;

public class Stack {
    int stackArray[]=new int[3];
    int pushCount=0,popCount=0;
    public void push(int data){
        stackArray[pushCount]=data;
        pushCount++;
    }
    public void DisplayStack(){
        for(int n: stackArray){
            System.out.println(n+" ");
        }
    }
    public int pop(){
        int data;
        data = stackArray[popCount];
        stackArray[popCount]=0;
        DisplayStack();
        return data;
    }

}