class Solution {
    public int helper(Node root,int call){
     if(root == null){
        return 0;
      }
      if(root.left == null && root.right == null && call == -1){
        return root.data;
      }
      int lsum = 0;
      int rsum = 0;
      lsum+=helper(root.left,-1);
      rsum+=helper(root.right,0);

      return lsum+rsum;
    }

    public int leftLeavesSum(Node root) {
      return helper(root,0);
    }
}
