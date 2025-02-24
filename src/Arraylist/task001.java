package Arraylist;


import java.util.ArrayList;

public class task001 {
    public static void main(String[] args) {
        ArrayList mylist=new ArrayList();
        mylist.add("100");
        mylist.add("ram");
        mylist.add("true");
        mylist.add("100");
        mylist.add("null");
        System.out.println(mylist);
        System.out.println(mylist.size());
        for( Object x:mylist){
            System.out.println(x);
        }

    }
}
