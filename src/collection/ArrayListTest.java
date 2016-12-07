package collection;

import java.util.ArrayList;

class Student {
	String name;
	int id;

	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	

}
public class ArrayListTest {
	

	public static void main(String[] args) {

		ArrayList<Student> ar= new ArrayList<Student>();
		
		for(int i=1;i<=5;i++){
			ar.add(new Student(i,"aaa"+i));
		}
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i).name);
		}
	}
	


}
