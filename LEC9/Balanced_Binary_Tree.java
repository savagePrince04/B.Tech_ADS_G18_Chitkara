package LEC9;

public class Balanced_Binary_Tree {
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
        public boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            boolean left = isBalanced(root.left);
            boolean right = isBalanced(root.right);
            int LeftHight = Hight(root.left);
            int RightHight = Hight(root.right);
            System.out.println(LeftHight);
            System.out.println(LeftHight);
            boolean s = Math.abs(LeftHight-RightHight)<=1;
            return left && right && s;
        }
        public static int Hight(TreeNode root){
            if(root==null){
                return -1;
            }
            return Math.max(Hight(root.left),Hight(root.right))+1;
        }
    }

}
