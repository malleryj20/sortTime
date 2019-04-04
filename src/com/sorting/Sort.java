package com.sorting;

import java.util.ArrayList;

public class Sort {

    public static ArrayList<Integer> selSort(ArrayList us, int len){
        int hold;
        int index = 0;
        int h2;
        ArrayList sorted = us;
        for (int i = 0; i < len; i++) {
            System.out.println(len-1);
            System.out.println(i);
            hold = Integer.parseInt(sorted.get(i).toString());
            index = i;
            for (int g = i; g < len; g++){
                System.out.println(g);
                if (Integer.parseInt(sorted.get(g).toString()) < hold){
                    hold = Integer.parseInt(sorted.get(g).toString());
                    index = g;
                }
            }
            h2 = Integer.parseInt(sorted.get(i).toString());
            sorted.set(i, hold);
            sorted.set(index, h2);
            System.out.println(sorted);
        }
        return sorted;
    }

    public static ArrayList<Integer> insSort(ArrayList us, int len){
        ArrayList sorted = new ArrayList();
        ArrayList take = us;
        int mem = 0;
        for (int i = 0; i < len; i++){
            mem = 0;
            for (int g = 0; g < len-i; g++){
                if (Integer.parseInt(take.get(mem).toString()) > Integer.parseInt(take.get(g).toString())){
                    mem = g;
                }
            }
            sorted.add(take.get(mem));
            take.remove(mem);
        }
        return sorted;
    }

    public static ArrayList<Integer> mergeSort(ArrayList us, int len){
        if (len < 2)
            return us;
        ArrayList first = new ArrayList();
        ArrayList last = new ArrayList();
        ArrayList ret = new ArrayList();
        first.addAll(us.subList(0, len/2));
        last.addAll(us.subList(len/2, len));
        int a = len/2;
        int b = ((len)-(len/2));
        first = mergeSort(first, a);
        last = mergeSort(last, b);


        for (int i = 0; i < len; i++){
            if (a == 0 || b == 0){
                if (a == 0){
                    ret.add(last.get(0));
                    last.remove(0);
                    b = b - 1;
                }
                else{
                    ret.add(first.get(0));
                    first.remove(0);
                    a = a - 1;
                }

            }
            else if (Integer.parseInt(first.get(0).toString())<Integer.parseInt(last.get(0).toString())){
                ret.add(first.get(0));
                first.remove(0);
                a = a - 1;
            }
            else{
                ret.add(last.get(0));
                last.remove(0);
                b = b - 1;
            }

        }
        return ret;


    }
}
