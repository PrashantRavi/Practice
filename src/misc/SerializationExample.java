package misc;

//http://www.jusfortechies.com/java/core-java/serialization.php

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;  

public class SerializationExample {

	public static void main(String[] args) {	

	}

}

 class Student implements Serializable{  
	 int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	}  

 
 class Persist{  
	 public static void main(String args[])throws Exception{  
	  Student s1 =new Student(211,"ravi");  
	  
	  FileOutputStream fout=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  
	  out.writeObject(s1);  
	  out.flush();  
	  System.out.println("success");  
	 }  
	}  
 
 
 
 class Depersist{  
	 public static void main(String args[])throws Exception{  
	    
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	  Student s=(Student)in.readObject();  
	  System.out.println(s.id+" "+s.name);  
	  
	  in.close();  
	 }  
	}  