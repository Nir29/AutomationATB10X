package myTask;

import java.util.Scanner;

public class task017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the year=");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println(year+" its a leap year ");
        } else if (year%400==0) {
            System.out.println(year+" its a leap year");
        }
        else {
            System.out.println(year+" not a leap year");
        }

    }
}
