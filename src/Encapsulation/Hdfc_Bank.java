package Encapsulation;

public class Hdfc_Bank extends Bank {
    public static void main(String[] args) {
        Hdfc_Bank b=new Hdfc_Bank();
       b.setName("nirmal");
       b.getName();
       b.setPassword("123s");
       b.getPassword();
        System.out.println(b.getName());
        System.out.println(b.getPassword());
    }
}
