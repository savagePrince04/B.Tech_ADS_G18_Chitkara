package Lec8;

public class Maximum_Depth_of_Binary_Tree {
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
        public int maxDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            int l=maxDepth(root.left);
            int r=maxDepth(root.right);
            return (Math.max(l,r)+1);
        }
    }
}
