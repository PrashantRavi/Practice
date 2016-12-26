package stack;

import java.util.Stack;

public class ReverseSortStack {

	public static void main(String[] args) {
		Stack <Integer>stk=new Stack<Integer>();
		stk.push(30);
		stk.push(-5);
		stk.push(18);
		stk.push(14);
		stk.push(-3);
		
		System.out.println(stk);
		reverse(stk);
		System.out.println(stk);
		sort(stk);
		System.out.println(stk);

	}
	public static void reverse(Stack<Integer> stk){
		if(!stk.empty()){
			int temp=stk.pop();
			reverse(stk);
			insertAtBottom(stk,temp);
		}
	}
	
	public static void insertAtBottom(Stack<Integer> stk,int item){
		if(stk.empty()){
			stk.push(item);
		}
		else{
			int temp=stk.pop();
			insertAtBottom(stk,item);
			stk.push(temp);
		}
	}
	
	
	
	public static void sort(Stack<Integer> stk){
		if(!stk.empty()){
			int temp=stk.pop();
			sort(stk);
			insertSort(stk,temp);
		}
	}
	
	public static void insertSort(Stack<Integer> stk,int item){
		if(stk.empty()||item>=stk.peek()){
			stk.push(item);
		}
		else{
			int temp=stk.pop();
			insertSort(stk,item);
			stk.push(temp);
		}
	}
	
	

}
