package Lec20;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> sc=new PriorityQueue<>(Collections.reverseOrder());
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
        sc.add(5);
        sc.add(2);
        sc.remove();
        System.out.println(sc);
    }
}
