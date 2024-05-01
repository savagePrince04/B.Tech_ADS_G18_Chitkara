package Lec24;

import java.util.HashMap;
import java.util.HashSet;

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
    public  boolean containsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public void AddVertex(int v){
        map.put(v,new HashMap<>());
    }
    public void RemoveEdge(int v1,int v2){
        map.get(v1).remove(v1);
        map.get(v2).remove(v1);
    }
    public void RemoveVertex(int v){
        for(int nbrs:map.get(v).keySet()){
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }
    public void display(){
        for(int key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }
    public int NoOfNode(){
        int sum=0;
        for(int key: map.keySet()){
            sum=sum+map.get(key).size();
        }
        return sum/2;
    }
    public boolean hasPath(int src,int dec,HashSet<Integer> set){
       if(src==dec){
           return true;
       }
       set.add(src);
       for(int nbrs:map.get(src).keySet()){
           if(!set.contains(nbrs)){
               boolean ans=hasPath(nbrs,dec,set);
               if(ans){
                   return true;
               }
           }
       }
       return false;
    }
}
