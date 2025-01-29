package myTask;

import java.util.Scanner;

public class task011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("eligible to vote");
        } else if (age<18) {
            System.out.println("not eligible to vote");
        }

    }
}
