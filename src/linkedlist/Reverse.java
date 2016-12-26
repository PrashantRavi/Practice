package linkedlist;

public class Reverse {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		rec(n1,n1);

	}

	
	public static void rec(Node head,Node head1){
		if(head==null)
			return;
		rec(head.next,head1.next);
		System.out.println(head.data+head1.data);
	}
}
