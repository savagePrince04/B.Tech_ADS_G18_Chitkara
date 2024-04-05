package Lec6;

import Lec6.Binary_Tree;

public class Binary_Tree_Client {

    public static void main(String[] args) {
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        Binary_Tree bt = new Binary_Tree();
        bt.PreOrder();
        bt.InOrder();
        bt.PostOrder();
    }

}