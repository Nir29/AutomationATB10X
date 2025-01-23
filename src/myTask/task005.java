package myTask;

import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num=");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even number "+num);

        }
        else{
            System.out.println("odd number "+num);
        }
    }
}
