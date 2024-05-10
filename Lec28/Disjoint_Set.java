package Lec28;

import java.util.HashMap;

public class Disjoint_Set {
    class node{
        int data;
        node parent;
        int rank;
    }
    private HashMap<Integer,node> map=new HashMap<>();
    public void CreateSet(int v){
        node nn=new node();
        nn.data=v;
        nn.parent=nn;
        nn.rank=0;
        map.put(v,nn);
    }
    public int find(int v){
        node nn=map.get(v);
        return find(nn).data;
    }
    private node find(node nn){
        if(nn.parent==nn){
            return nn;
        }
        return find(nn.parent);
    }
    public void Union(int v1,int v2){
        node nn1=map.get(v1);
        node nn2=map.get(v2);
        node r1=find(nn1);
        node r2=find(nn2);
        if(r1.rank==r2.rank){
            r1.parent=r2;
            r2.rank++;
        }
        else if(r1.rank> r2.rank){
            r2.parent=r1;
            r1.rank++;
        }
        else {
            r1.parent=r2;
            r2.rank++;
        }
    }
}
