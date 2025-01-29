package myTask;

import java.util.Scanner;

public class task016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        char grade='F';
        int score=sc.nextInt();
        if(score>=90 && score<=100) {
            grade='A';
            System.out.println("Your grade is-->"+grade);
        }
        else if(score>=80 && score<=89)
        {
            grade='B';
            System.out.println("your grade is -->"+grade);
        }
        else if(score>=70 && score<=79) {
            grade='C';
            System.out.println("Your grade is -->"+grade);
        }
        else if(score>=60 && score<=69) {
            grade='D';
            System.out.println("your grade is -->"+grade);
        }
        else if(score<0 && score>100) {
            grade='O';
            System.out.println("you are God");
        }
        else {
            System.out.println("fail");
        }
    }

}



