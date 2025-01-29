package myTask;

import java.util.Scanner;

public class task007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a=");
        int a=sc.nextInt();
        System.out.println("enter value of b=");
        int b=sc.nextInt();
        int result_sum = sum(a, b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        System.out.println(result_sum);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
}
