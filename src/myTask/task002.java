package myTask;

import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your score=");
        int score=sc.nextInt();
        char grade=(score>=90&&score<=100)?'A':(score>=80&&score<=89)?'B':(score>=70&&score<=79)?'C':(score>=60&&score<=69)?'D':'F';
        System.out.println("your grade is "+grade);


    }
}
