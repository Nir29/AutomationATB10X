package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task002 {
    public static void main(String[] args) {
        List mylist=new ArrayList();
        mylist.add(100);
        mylist.add("bikram");
        mylist.add("true");
        mylist.add("200");
        mylist.add("nirmal");
        mylist.add("false");
        System.out.println(mylist);
        mylist.add(1,"bulu");
        System.out.println(mylist);
        System.out.println(mylist.contains("bulu"));

        Iterator it= mylist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
