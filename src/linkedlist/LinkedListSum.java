package linkedlist;

public class LinkedListSum {

	public static void main(String[] args) {
	
		LinkedListSum ls= new LinkedListSum();	
		
	Node n1 = new Node(2);
	Node n2 = new Node(4);
	Node n3 = new Node(3);
	
	Node n4 = new Node(5);
	Node n5 = new Node(6);
	Node n6 = new Node(4);
	
	n1.next=n2;
	n2.next=n3;
	
	n4.next=n5;
	n5.next=n6;
	
	ls.printNode(ls.addTwoNumbers(n1, n4));
	

	}
	
	public Node addTwoNumbers(Node l1,Node l2){
		
		int carry=0;
		Node newHead=new Node(0);
		Node p1=newHead;
		while(l1!=null ||l2!=null){
			if(l1!=null){
				carry+=l1.data;
				l1=l1.next;
			}
			
			if(l2!=null){
				carry+=l2.data;
				l2=l2.next;
			}
			
			p1.next=new Node(carry%10);
			p1=p1.next;
			carry/=10;
			
		}
		
		if(carry==1){
			p1.next=new Node(1);
		}
		
		return newHead.next;
	}
	
	public void printNode(Node head){
		while(head!=null){
			System.out.print(" "+head.data);
			head=head.next;
		}
	}
}

