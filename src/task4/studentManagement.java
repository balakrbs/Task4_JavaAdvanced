package task4;
import java.io.*;
import java.util.Scanner;

//Question no 1

public class studentManagement{
	private int rollno;
	private String name;
	private int age;
	private String course;
	
	public studentManagement(int rollno, String name, int age, String course) throws NameNOtvalidException, AgeNotWithinRangeException {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
		
		if(!(age>=15 && age<=21)) {
			throw new AgeNotWithinRangeException("Age should be between(15 to 21)");
		}
		if(!name.matches("[a-z A-z]+")) {
			throw new NameNOtvalidException("Name should only contain alphabets");
		}
		System.out.println("added");
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the Rollno : ");
		int rollno=obj.nextInt();
		obj.nextLine();
		System.out.print("enter the Name : ");
		String name=obj.nextLine();
		System.out.print("enter the Age : ");
		int age=obj.nextInt();
		obj.nextLine();
		System.out.print("enter the Course : ");
		String course=obj.nextLine();
		
		try {
			studentManagement student1=new studentManagement(rollno,name,age,course);
			
		}catch(AgeNotWithinRangeException | NameNOtvalidException e) {
			System.out.println("Error : "+e.getMessage());			
		}
	}

}
