package Inheritance;

public class Child extends Father {
    int a;
    int b;
    void mul(){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Child c1=new Child();
        c1.a=10;
        c1.b=20;
        c1.mul();
        c1.x=25;
        c1.y=35;
        c1.sub();

    }
}
