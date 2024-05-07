package task4;
import java.util.*;

//Question no 2

public class voter {
	private int voterid;
	private String name;
	private int age;
	
	
	public voter(int voterid, String name, int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Invalid age for voting!! -> "+name);
		}

		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
	public int getVoterid() {
		return voterid;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String arg[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("----Enter Voter Information----");
		System.out.print("Enter Voterid : ");
		int voterid=obj.nextInt();
		obj.nextLine();
		System.out.print("Enter Name : ");
		String name=obj.nextLine();
		System.out.print("Enter Age : ");
		int age=obj.nextInt();
		
		try {
			voter vtr=new voter(voterid,name,age);
			System.out.println("\n voter created ");
			System.out.println("voterid : "+vtr.getVoterid());
			System.out.println("Name : "+vtr.getName());
			System.out.println("age : "+vtr.getAge());
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	
	obj.close();
		
	}
}
