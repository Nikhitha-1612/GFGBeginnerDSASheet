class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
     ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }
    
    private void inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
}
