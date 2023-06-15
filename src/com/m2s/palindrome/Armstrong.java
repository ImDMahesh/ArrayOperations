package com.m2s.palindrome;

public class Armstrong {
    public Armstrong() {
    }
    public static void main(String[] args) {
        int num = 154;
        if (Armstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("NOT A Armstrong");
        }

    }

    private static boolean Armstrong(int num) {
        int temp  = num;
        int reminder = 0;
        int sum=0;
        while(num!=0){
            reminder = num%10;
            sum = sum + (reminder*reminder*reminder);
            num/=10;
        }
        if(temp ==  sum)
            return true;
        else
            return false;
    }
}

