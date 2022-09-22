package com.m2s.arrayops;

public class MaxEleInArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int max = findMaxElement(arr);
        System.out.println("The Maximum number in the array is: " + max);
    }

    private static int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
}