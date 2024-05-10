package Lec31;

import java.util.HashMap;

 class Trie {
    class node{
        char data;
        boolean isTerminated;
        HashMap<Character,node> map=new HashMap<>();
    }
    node root;
    public Trie(){
        node nn=new node();
        nn.data='*';
        root=nn;
    }
    public void Insert(String word){
        node cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.map.containsKey(ch)){
                cur=cur.map.get(ch);
            }
            else {
                node n=new node();
                n.data=ch;
                cur.map.put(ch,n);
                cur=n;
            }
        }
        cur.isTerminated=true;
    }
    public boolean search(String word) {
        node cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.map.containsKey(ch)){
                cur=cur.map.get(ch);
            }
            else {
                return false;
            }
        }
        return cur.isTerminated;
    }
    public boolean startsWith(String prefix) {
        node cur=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(cur.map.containsKey(ch)){
                cur=cur.map.get(ch);
            }
            else {
                return false;
            }
        }
       return true;
    }
}
