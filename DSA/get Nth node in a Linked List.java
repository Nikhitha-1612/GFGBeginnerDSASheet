public class Node {
  int data;
  Node next;
  Node(int d){
	  data = d;
	  next=null;
	}
public class LinkedList {
	 public static Node head;
     public static  int GetNth(int index) {
        Node current = head;
    	 int count=0;
    	 while(current!=null) {
    		 if(count==index)
    			 return current.data;
    		 count++;
    		 current=current.next;
    	 }
    	 return 0;
     }
     //Given a referenceto the head of a list and int inserts a newNode on the front of the linked list
     public void push(int new_data) {
    	 Node new_node=new Node(new_data);
    	 new_node.next=head;
    	 head = new_node;
     }
     public static void main(String[] args) {
    	 LinkedList list = new LinkedList();
    	 list.push(1);
    	 list.push(2);
    	 list.push(18);
    	 list.push(30);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the data you want to from index");
    	int input = sc.nextInt();
    	int ans;
		try {
			ans = GetNth(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ans = GetNth(input);
    	if(ans!=0)
    		System.out.println(ans);
    	else
    		System.out.println("Enter the valid input!");
    		
     }
