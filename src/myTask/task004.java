package myTask;

import java.util.Scanner;

public class task004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of side1=");
        int side1= sc.nextInt();
        System.out.println("Enter length of side2=");
        int side2= sc.nextInt();
        System.out.println("Enter length of side3=");
        int side3= sc.nextInt();
        String shape=(side1==side2&&side1==side3)?"Equilateral":(side1==side2||side2==side3)?"Isoscale":"scalene";
        System.out.println(shape);
    }
}
