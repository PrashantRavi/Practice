package linkedlist;

public class EvenOddList {

	public static void main(String[] args) {
		
		EvenOddList ed= new EvenOddList();
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
				
		
		ed.printNode(n1);
		ed.oddEvenList(n1);
		System.out.println();
		ed.printNode(n1);
	}
	
	public void printNode(Node head){
		while(head!=null){
			System.out.print(" "+head.data);
			head=head.next;
		}
	}
	
	public Node oddEvenList(Node head) {
	    if(head == null) 
	        return head;
	 
	    Node result = head;
	    Node p1 = head;
	    Node p2 = head.next;
	    Node connectNode = head.next;
	 
	    while(p1 != null && p2 != null){
	            Node t = p2.next;
	            if(t == null)
	                break;
	 
	            p1.next = p2.next;
	            p1 = p1.next;
	 
	            p2.next = p1.next;
	            p2 = p2.next;
	    }
	 
	    p1.next = connectNode;
	 
	    return result;
	}

}
