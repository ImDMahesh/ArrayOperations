package com.m2s.palindrome;

public class Palindrome {
    public static void main(String []args){
        int num = 121;

        if(palindrome(num))
            System.out.println("PALINDROME");
        else
            System.out.println("NOT A PALINDROME");
    }
    private static boolean palindrome(int num) {
        int temp  = num;
        int reminder = 0;
        int sum=0;
        while(num!=0){
            reminder = num%10;
            sum = sum * 10 + reminder;
            num/=10;
        }
        if(temp ==  sum)
            return true;
        else
            return false;
    }
}
