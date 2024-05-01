package Lec24;

import java.util.HashSet;

public class Graph_client {
    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.AddEdge(1,2,6);
        g.AddEdge(1,3,7);
        g.AddEdge(2,4,5);
        g.AddEdge(2,5,2);
        g.AddEdge(3,4,8);
        g.AddEdge(4,5,1);
        g.AddEdge(5,6,3);
        g.display();
        System.out.println("*******************");
        g.RemoveEdge(1,2);
        g.display();
      boolean ans=g.hasPath(1,7,new HashSet<>());
        System.out.println(ans);
       int p=g.NoOfNode();
        System.out.println(p);
    }
}
