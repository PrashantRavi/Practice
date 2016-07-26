package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedListT a = new LinkedListT();
		a.addAtBegin(5);
		a.addAtBegin(10);
		a.addAtBegin(15);
		a.addAtBegin(20);
		a.addAtBegin(25);
		a.addAtBegin(30);
//		System.out.print("Original Link List 1 : ");
		a.display(a.head);
//a.reverseIterative(a.head);	

	}
	
	

}
