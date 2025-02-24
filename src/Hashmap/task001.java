package Hashmap;

import java.util.HashMap;

public class task001 {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(100,"ram");
        map.put(200,"nala");
        map.put(300,"bikram");
        map.put(400,"tinua");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
