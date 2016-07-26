package linkedlist;

public class MergetwoList {

	private LinkedListT a;
	private LinkedListT b;

	public MergetwoList(LinkedListT a, LinkedListT b) {
		this.a = a;
		this.b = b;

	}

	public void display(Node h) {
		Node curr = h;
		System.out.println("");
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println("");
	}

	public LinkedListT mergeWithOutRecur() {
		LinkedListT result = new LinkedListT();
		while(a.head!=null && b.head!=null){
		if(a.head.data<b.head.data)	{
			result.addAtEnd(a.head.data);
			a.head=a.head.next;
		}
		else{
			result.addAtEnd(b.head.data);
			b.head=b.head.next;
		}
		
		}
		while (a.head != null) {
			result.addAtEnd(a.head.data);
			a.head = a.head.next;
		}
		while (b.head != null) {
			result.addAtEnd(b.head.data);
			b.head = b.head.next;
}
return result;
	}

	public static void main(String[] args) {
		System.out.println("Method : without Recursion");
		LinkedListT a1 = new LinkedListT();
		a1.addAtBegin(18);
		a1.addAtBegin(6);
		a1.addAtBegin(2);
		LinkedListT b1 = new LinkedListT();
		b1.addAtBegin(19);
		b1.addAtBegin(17);
		b1.addAtBegin(3);
		b1.addAtBegin(1);
		MergetwoList m1 = new MergetwoList(a1, b1);
		m1.display(a1.head);
		m1.display(b1.head);

		LinkedListT res = m1.mergeWithOutRecur();
		m1.display(res.head);

	}

}
