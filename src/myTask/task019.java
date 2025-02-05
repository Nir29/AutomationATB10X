package myTask;

import java.util.Scanner;

public class task019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the days");
        int totaldays=sc.nextInt();
        int years=totaldays/365;
        int remaining_days=totaldays%365;
        int months=remaining_days/30;
        int days=remaining_days%30;

        System.out.printf("%d years,%d months,%d days",years,months,days);

sc.close();
    }
}
