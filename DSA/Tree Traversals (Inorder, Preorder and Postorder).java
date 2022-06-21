public class Node {

	int key;
	Node left,right;
	public Node(int d) {
		key=d;
		left=right=null;
	}
  public class BinaryTree {
   Node root;
   BinaryTree(){
	   root=null;
   }
   void PrintPostorder(Node node) {
	   if(node==null)
		   return ;
	   //left right root
	   PrintPostorder(node.left);
	   PrintPostorder(node.right);
	  System.out.println(node.key+" ");
   }
   void PrintInorder(Node node) {
	   if(node==null)
		   return;
	   //left root right
	   PrintInorder(node.left);
	   System.out.println(node.key+" ");
	   PrintInorder(node.right);
   }
   private void PrintPreorder(Node root2) {
		// TODO Auto-generated method stub
		   if(root2==null)
			   return ;
		   System.out.println(root2.key + " ");
		   PrintPreorder(root2.left);
		   PrintPreorder(root2.right);
		
	}
   //wrappers over above recursive functions
   void PrintPostorder() {
	   PrintPostorder(root);
   }
   void PrintInorder() {
	   PrintInorder(root);
   }
   void PrintPreorder() {
	   PrintPreorder(root);
   }
   
public static void main(String[] args) {
	   BinaryTree tree = new BinaryTree();
	   tree.root =new Node(1);
	   tree.root.left=new Node(2);
	   tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);
       System.out.println("Preorder traversal is" );
       tree.PrintPreorder();
       System.out.println("Inorder traversal is");
       tree.PrintInorder();
       System.out.println("PostOrder traversal is");
       tree.PrintPostorder();
       
   }
