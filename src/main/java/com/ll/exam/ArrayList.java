package com.ll.exam;

public class ArrayList {
    private int size;
    private int[] arr;

    public ArrayList() {
        this.size = 0;
        this.arr = new int[2];
    }

    public int size() {
        return this.size;
    }

    public void add(int data) {
        if (isFull()) {
            expandSize();
        }

        this.arr[size++] = data;
    }

    public boolean isFull() {
        return this.arr.length == this.size;
    }

    public void expandSize() {
        int[] tempArr = new int[2 * this.size];

        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = this.arr[i];
        }

        this.arr = tempArr;
    }

    public int get(int index) {
        return arr[index];
    }

    public void removeAt(int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size] = 0;
        --size;
    }

    public int getArrayLength() {
        return arr.length;
    }
}
