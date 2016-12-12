package linkedlist;

import java.util.Stack;

public class Palimdrom {

	public static void main(String[] args) {
		
	 Palimdrom p= new Palimdrom();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(4);
		Node n4 = new Node(2);
		Node n5 = new Node(6);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
  
		System.out.println(p.checkPalin(n1));
		
	}
	
	
	public boolean checkPalin(Node n){
		Stack<Integer> st= new Stack<Integer>();
		 Node curr=n;
		 
		 while(curr!=null){
			 st.push(curr.data);
			 curr=curr.next;
		 }
		 
		 while(n!=null){
			 int i=st.pop();
			 if(i!=n.data){
				 return false;
			 }
			 n=n.next;
		 }
		 return true;
	}

}
