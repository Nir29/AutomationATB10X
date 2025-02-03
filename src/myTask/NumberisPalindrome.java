package myTask;

import java.util.*;

public class NumberisPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number=");
        int num=sc.nextInt();
        int Number=num;
        int reversenum=0;
        while(num!=0){
            int digit=num%10;
            reversenum=reversenum*10+digit;
            num/=10;
        }
        if (reversenum == Number) {
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }

    }
}

