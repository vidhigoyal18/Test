package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Palindromstring {
    public static void main(String[]args){
        int n,a,sum=0,r;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        a=n;
        while(n>0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
            System.out.println("Hello");
        }
        if(a==sum)
            System.out.println("Palindrome string");
        else
    System.out.println("Not Palindrome");
    }
}
