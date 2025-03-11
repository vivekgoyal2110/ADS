package test;

import java.util.*;

public class Reverse {
    public static void main(String args[]){
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr, new Comparator<Integer>() {
           public int compare(Integer a, Integer b){
            return b-a;
           } 
        });

        System.out.println(Arrays.toString(arr));
    }
}
