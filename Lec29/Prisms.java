package Lec29;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

 class Prims {
    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Prims(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }

    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    class PrimsPair {
        int v1;
        int v2;
        int cost;

        public PrimsPair(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        public String toString() {
            return v1 + "-" + v2 + "Cost" + cost;
        }
    }

    public int prims() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsPair(1, 1, 0));
        int sum = 0;
        while (!pq.isEmpty()) {
            // 1. remove
            PrimsPair rp = pq.poll();

            if (visited.contains(rp.v1)) {
                continue;
            }
            // Add visited
            visited.add(rp.v1);
            // self work
            System.out.println(rp);
            sum += rp.cost;
            //  Add unvisited
            for (int nbrs : map.get(rp.v1).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = map.get(rp.v1).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.v1, cost));
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prims ps = new Prims(n);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            ps.AddEdge(v1, v2, cost);
        }
        System.out.println(ps.prims());

    }

}