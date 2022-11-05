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
    public int popLastElement(){
        int data;
        pushCount--;// in the above push method I have already incremented pushCount
                    // so if I decrement it once I will get the last value
        data = stackArray[pushCount];
        stackArray[pushCount]=0;
        DisplayStack();
        return data;
    }
    public int popFirstElement(){
        int data;
        data = stackArray[popCount];
        stackArray[popCount]=0;
        DisplayStack();
        return data;
    }


}
