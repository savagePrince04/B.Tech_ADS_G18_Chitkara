package Lec27;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class Is_Graph_Bipartite {
    class Solution {
        public boolean isBipartite(int[][] graph) {
            Queue<Bipartite> q=new LinkedList<>();
            HashMap<Integer,Integer> Visited=new HashMap<>();
            for(int key=0;key<graph.length;key++){
                if(Visited.containsKey(key)){
                    continue;
                }
                q.add(new Bipartite(key,0));
                while(!q.isEmpty()){
                    // remove
                    Bipartite rv=q.remove();
                    //ignore
                    if(Visited.containsKey(rv.ver)){
                        if(Visited.get(rv.ver)!=rv.dis){
                            return false;
                        }
                        continue;
                    }
                    // add visited
                    Visited.put(rv.ver, rv.dis);
                    // add unvigited
                    for(int nbrs:graph[rv.ver]){
                        if(!Visited.containsKey(nbrs)){
                            q.add(new Bipartite(nbrs,rv.dis+1));
                        }
                    }
                }
            }
            return true;
        }
    }
    class Bipartite{
        int ver;
        int dis;
        Bipartite(int ver,int dis){
            this.ver=ver;
            this.dis=dis;
        }
    }
}
