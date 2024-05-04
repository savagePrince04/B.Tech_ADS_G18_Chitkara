package Lec26;
import java.util.*;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    Graph(int v){
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void AddVertex(int v){
        map.put(v,new HashMap<>());
    }
    public int NooFEdge(){
        int sum=0;
        for(int nbrs:map.keySet()){
            sum=sum+map.get(nbrs).size();
        }
        return sum/2;
    }
    public boolean ContainsEdge(int v1,int v2){
         return map.get(v1).containsKey(v2);
    }
    public void RemoveEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void RemoveVertex(int v){
        for(int nbrs: map.keySet()){
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }
    public void display(){
        for(int key: map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }
    public boolean BFS(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        HashSet<Integer> visited = new HashSet<>();
        while (!q.isEmpty()) {
            // Remove
            int rv = q.remove();
            // ignore
            if (visited.contains(rv)) {
                continue;
            }
            // Add visited
            visited.add(rv);
            // self work
            if (rv == des) {
                System.out.print(rv+" ");
                return true;
            }
            // add Unvisited
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean DFS(int src, int des) {
        Stack<Integer> s = new Stack<>();
        s.push(src);
        HashSet<Integer> visited = new HashSet<>();
        while (!s.isEmpty()) {
            int rv = s.pop();
            if (visited.contains(rv)) {
                continue;
            }
            visited.add(rv);
            if (rv == des) {
                System.out.print(rv+" ");
                return true;
            }
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    s.push(nbrs);
                }
            }
        }
        return false;
    }
    public boolean BFT(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        HashSet<Integer> visited = new HashSet<>();
        int count=0;
        for(int key: map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            q.add(key);
            count++;
            while (!q.isEmpty()) {
                // Remove
                int rv = q.remove();
                // ignore
                if (visited.contains(rv)) {
                    continue;
                }
                // Add visited
                visited.add(rv);
                // self work
                if (rv == des) {
                    System.out.print(rv + " ");
                    return true;
                }
                // add visited
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return false;
    }
    public boolean DFT(int src, int des) {
        Stack<Integer> sc=new Stack<>();
        sc.push(src);
        HashSet<Integer> visited = new HashSet<>();
        int count=0;
        for(int key: map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            sc.push(key);
            count++;
            while (!sc.isEmpty()) {
                // Remove
                int rv = sc.pop();
                // ignore
                if (visited.contains(rv)) {
                    continue;
                }
                // Add visited
                visited.add(rv);
                // self work
                if (rv == des) {
                    System.out.print(rv + " ");
                    return true;
                }
                // add visited
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        sc.add(nbrs);
                    }
                }
            }
        }
        return false;
    }
}
