package Task7feb;

import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num=");
        int num=sc.nextInt();

        for (int i=1;i<=num;i++){
             for (int j=1;j<=i;j++){
                 System.out.print("*");
             }
            System.out.println();
        }
sc.close();
    }
}
