class Solution {
    int ans = Integer.MAX_VALUE;
    Node pre = null;
    int absolute_diff(Node root) {
        inOrder(root);
        return ans;
    }
    public void inOrder(Node root)
    {
        if(root ==  null)return;
        inOrder(root.left);
        if(pre != null){
            ans = Math.min(ans, root.data - pre.data);
        }
            pre= root;
            inOrder(root.right);
    }
}
