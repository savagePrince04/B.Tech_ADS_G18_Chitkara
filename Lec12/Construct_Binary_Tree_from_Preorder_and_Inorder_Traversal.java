package Lec12;
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int prelength=preorder.length-1; //pre
            int inlength=inorder.length-1;  //in
            return  ConstractTree(preorder,inorder,0,prelength,0,inlength);
        }
        public TreeNode ConstractTree(int pre[],int ino[],int prelow,int prehigh,int inlow,int inhigh){
            if(prelow>prehigh || inlow>inhigh){
                return null;
            }
            TreeNode newnode = new TreeNode();
            newnode.val=pre[prelow];  //root
            int si=-1;
            for(int i=inlow;i<=inhigh;i++){
                if(pre[prelow]==ino[i]){
                    si=i;
                    break;
                }
            }
            int nel=si-inlow;
            newnode.left = ConstractTree(pre,ino,prelow+1,prehigh+nel,inlow,si-1);
            newnode.right = ConstractTree(pre,ino,prelow+nel+1,prehigh,si+1,inhigh);
            return newnode;
        }
    }
}
