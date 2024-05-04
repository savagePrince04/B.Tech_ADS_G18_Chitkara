package Lec26;
public class Gragp_client {
    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.AddEdge(1,2,6);
        g.AddEdge(1,3,7);
        g.AddEdge(3,4,8);
        g.AddEdge(4,2,5);
        g.AddEdge(4,5,1);
        g.AddEdge(2,5,2);
        g.AddEdge(5,6,3);
        g.display();
        System.out.println("********************");
        g.RemoveEdge(1,3);
        g.display();
        System.out.println(g.ContainsEdge(1,3));
    g.AddVertex(10);
        g.display();
        g.RemoveVertex(10);
        g.display();
        System.out.println("*************");
       boolean a= g.BFS(1,2);
        System.out.println(a);
        g.display();
        boolean a2= g.BFS(1,6);
        System.out.println(a2);

        System.out.println(g.DFS(1,6));
        System.out.println(g.BFT(1,6));
        System.out.println(g.DFS(2,6));

    }
}
