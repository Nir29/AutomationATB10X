import java.util.Scanner;

public class interviewQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of i=");
        int i = sc.nextInt();
        System.out.println("enter the value of j=");
        int j = sc.nextInt();

        boolean ans=result(i,j);
        System.out.println(result(i,j));
    }

    static boolean result(int i, int j) {
        if (i == 1 || j == 1||i+j==1) {
            return true;
        }

        return false;
    }

}