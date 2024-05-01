package Lec23;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map_Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ram",1);
        map.put("ram",10);
        map.put("shyam",2);
        map.put("Mohan",3);
        map.put("sohan",4);
        map.put(null,4);
        System.out.println(map.containsKey("mohan"));
        System.out.println(map);
        map.remove("ram");
        System.out.println(map);

        TreeMap<String,Integer>map1=new TreeMap<>();
        map1.put("ram",1);
      map1.put("shyam",2);
       map1.put("Mohan",3);
       map1.put("sohan",4);
        System.out.println(map1);
        LinkedHashMap<String,Integer> map3=new LinkedHashMap<>();
        map3.put("Ram",10);
        map3.put("shyam",20);
        map3.put("mohan",30);
        map3.put("sohan",40);
        System.out.println(map3);
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
   }

}
