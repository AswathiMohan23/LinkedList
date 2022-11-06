package com.java;

public class Stack {
    int size = 0;
    int stackArray[] = new int[4];
    int pushCount = 0, popCount = 0;

    public void push(int data) {
        stackArray[pushCount] = data;
        pushCount++;
        size++;
    }

    public void displayStack() {
        for (int n : stackArray) {
            System.out.println(n + " ");
        }
    }
    public void show() {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] != 0)
                System.out.println(stackArray[i] + " ");
        }
    }

    public int popLastElement() {
        int data;
        pushCount--;// in the above push method I have already incremented pushCount
        // so if I decrement it once I will get the last value
        data = stackArray[pushCount];
        stackArray[pushCount] = 0;
        displayStack();
        return data;
    }

    public int popFirstElement() {
        int data;
        data = stackArray[popCount];
        stackArray[popCount] = 0;
        displayStack();
        return data;
    }

    public int popTheElement(){
        int data;
        pushCount--;
        pushCount--;// in the above push method I have already incremented pushCount
        // so if I decrement it twice I will get the second last value
        data = stackArray[pushCount];
        stackArray[pushCount] = 0;
        show();
        size--;
        return data;
    }
    public int size() {
        return size;
    }

}
