package com.sorting;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList x = new ArrayList<Integer>();
        x.add(4);
        x.add(12);
        x.add(5);
        x.add(3);
        x.add(7);
        System.out.println(Sort.mergeSort(x, 5).toString());
    }
}
