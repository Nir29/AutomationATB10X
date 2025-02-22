package InterfaceDemo;

public class  Interface1 implements shape{
    public void circle(){
        System.out.println("this circle from abstract method");
    }
    public static void main(String[] args) {
        Interface1 itobj=new Interface1();
        itobj.circle();
        itobj.squre();
        shape.rectangle();
        shape sh=new Interface1();
        sh.circle();
        sh.squre();
        shape.rectangle();

    }


}
interface shape{
    int length=10;
    int width=20;
    void circle();
    default void squre(){
        System.out.println("this squre from default method");
    }
    static void rectangle(){
        System.out.println("this rectangle from static method");
    }
}