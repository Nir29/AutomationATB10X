package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class task001 {
    public static void main(String[] args) {
        HashSet myset=new HashSet();
        myset.add("ram");
        myset.add("nala");
        myset.add("100");
        myset.add("500");
        myset.add("true");
        System.out.println(myset);

        Iterator it=myset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
