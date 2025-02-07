package Task7feb;

import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number=");
        int number=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number+"x"+i+"="+(number*i));
        }
        sc.close();
    }
}
