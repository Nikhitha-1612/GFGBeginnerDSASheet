class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> list =new ArrayList<Integer>();
       //left right root
      PrintpostOrder(root,list);
       
       return list;
    }
    private void PrintpostOrder(Node node,ArrayList<Integer> list){
        if(node==null)
        return;
        PrintpostOrder(node.left,list);
        PrintpostOrder(node.right,list);
        list.add(node.data);
    }
}
