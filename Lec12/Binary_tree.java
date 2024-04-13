package Lec12;

import java.util.Scanner;

public class Binary_tree {
    class node{
        int data;
        node left;
        node right;
    }
    node root;
    Scanner sc=new Scanner(System.in);
    Binary_tree(){
        root=CreateTree();
    }
    public node CreateTree(){
    int element=sc.nextInt();
    node newnode=new node();
    newnode.data=element;
    boolean hlc=sc.nextBoolean();
    if(hlc){
      root.left=CreateTree();
    }else{
        return null;
    }
        boolean hrc=sc.nextBoolean();
        if(hrc){
            root.right=CreateTree();
        }else{
            return null;
        }
        return newnode;
    }
}
