package Lec23;

import java.util.HashSet;

public class Set_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(30);
        System.out.println(set);
        System.out.println(set.contains(60));
        for(int a:set){
            System.out.print(a+" ");
        }
    }
}
