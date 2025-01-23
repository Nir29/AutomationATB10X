package myTask;

public class task003 {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=20;
        String result=((a>b)&(a>c))?"a":(b>c)?"b" :"c";
        System.out.println("largest num is "+result);
    }
}
