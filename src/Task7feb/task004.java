package Task7feb;

import java.util.Scanner;

public class task004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number!=");
        int num=sc.nextInt();
        int factorial=1;
        for (int i=num;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial of num is"+factorial);
    }
}
