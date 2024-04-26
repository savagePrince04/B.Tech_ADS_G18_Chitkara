package Lec19;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> ll= new ArrayList<>();
    public void add(int ele){
    ll.add(ele);
    Upheapify(ll.size()-1);
    }
    public void Upheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(ci)<ll.get(pi)){
        swap(ci,pi);
        Upheapify(pi);
    }}
    public void swap(int ci,int pi){
        int pith=ll.get(pi);
        int cith=ll.get(ci);
        ll.set(ci,pith);
        ll.set(pi,cith);
    }
    public int remove(){
        swap(0, ll.size() - 1);
        int rv = ll.remove(ll.size() - 1);
        downheapify(0);
        return rv;

    }
    private void downheapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;
        if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
            mini = lci;

        }
        if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
            mini = rci;

        }
        if (mini != pi) {
            swap(pi, mini);
            downheapify(mini);
        }

    }
    public int size(){
        return ll.size()-1;
    }
    public int get(){
        return ll.get(0);
    }
    public void Display(){
        System.out.println(ll);
    }
}
