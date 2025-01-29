package myTask;

import java.util.Scanner;

public class task014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number=");
        int num1=sc.nextInt();
        System.out.println("enter the second number=");
        int num2=sc.nextInt();
        if (num1<num2){
            System.out.println("smallest number is "+num1);
        } else {
            System.out.println("smallest number is "+num2);
        }
    }
}
