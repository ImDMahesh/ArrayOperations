package com.m2s.SAM;

public class LambdaEx {
    public static void main(String[] args) {
        StringOps stringOps = (str)->{
          String result = "";
          for(int i=str.length()-1;i>=0;i--)
              result += str.charAt(i);
            return result;
        };
        System.out.println("Reverse of a given string: "+stringOps.reverse(""));
    }
}
