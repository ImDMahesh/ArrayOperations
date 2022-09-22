package com.m2s.arrayops;

public class MaxEleInArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int max = findMaxElement(arr);
        System.out.println("The Maximum number in the array is: " + max);
    }

    private static int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(max<num)
                max = num;
        }
        //returns The Maximum number in the array is: 35
        return max;
    }
}