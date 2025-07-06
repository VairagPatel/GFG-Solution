class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }
    
    private static void preorder(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        
        result.add(node.data);          
        preorder(node.left, result);   
        preorder(node.right, result);
    }
}
