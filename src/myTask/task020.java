package myTask;

import java.util.Scanner;

public class task020 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr your URL=");
        String url=sc.nextLine();
        if(url.contains(".com")){
            System.out.println("website is commersial");
        } else if (url.contains(".edu")) {
            System.out.println("website is educational");
        } else if (url.contains(".org")) {
            System.out.println("website is nonprofit organigation");
        }
        sc.close();
    }
}
