package myTask;

import java.util.Scanner;

public class task018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr number");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println(num+"  is divisible by 5");
        } else if (num%11==0) {
            System.out.println(num+" is divisible by 11 ");
        }
        sc.close();
    }
}
