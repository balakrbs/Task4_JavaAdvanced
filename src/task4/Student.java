package task4;

import java.util.*;

//Question no 4


public class Student {

	private HashMap<String, Integer> studentmap;

	public Student() {
		
		studentmap =new HashMap<>();
	}
	
	public void addstudent(String name, int grade) {
		studentmap.put(name, grade);
	}
	
	public void removestudent(String name) {
		studentmap.remove(name);
	}
	
	public void displayinfo(String name) {
		Integer grade=studentmap.get(name);
		if(grade!=null) {
			System.out.println(name+" grade is "+grade+"\n");
		}else {
			System.out.println(name+" is not found\n");
		}
	}
	
	public static void main(String[] args) {
		Student std=new Student();
		std.addstudent("arun",85);
		std.addstudent("rahul",78);
		std.addstudent("kavin",95);
		
		std.displayinfo("rahul");
		
		std.removestudent("arun");
		
		std.displayinfo("arun");
		std.displayinfo("rahul");
		std.displayinfo("kavin");
	}

}
