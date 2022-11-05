package com.java;

import org.w3c.dom.ls.LSOutput;

public class Stack {
    int stackArray[]=new int[3];
    int count=0;
    public void push(int data){
        stackArray[count]=data;
        count++;
    }
    public void DisplayStack(){
        for(int n: stackArray){
            System.out.println(n+" ");
        }
    }

}
