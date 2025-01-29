package myTask;

import java.util.Scanner;

public class task009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first num1");
        int num1=sc.nextInt();
        System.out.println("enter the second num2");
        int num2=sc.nextInt();
        if (num1>num2){
            System.out.println("maximun is "+num1);
        } else if (num2>num1) {
            System.out.println("maximum is "+num2);
        }
        else{
            System.out.println("two numbers are equal");
        }
    }
}
