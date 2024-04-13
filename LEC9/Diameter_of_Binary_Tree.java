package LEC9;

public class Diameter_of_Binary_Tree {
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
        public int diameterOfBinaryTree(TreeNode root) {
            if(root==null){
                return 0;
            }
            int leftDiameter =  diameterOfBinaryTree(root.left);
            int rightDimeter =  diameterOfBinaryTree(root.right);
            int leftHight = Hight(root.left);
            int rightHight= Hight(root.right);
            int selfD=(leftHight+rightHight)+2;
            return Math.max(selfD,Math.max(leftDiameter,rightDimeter));
        }
        public static int Hight(TreeNode root){
            if(root==null){
                return -1;
            }
            int lh=Hight(root.left);
            int rh=Hight(root.right);
            return Math.max(lh,rh)+1;
        }
    }
}
