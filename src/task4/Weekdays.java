package task4;
import java.util.*;

//Question no 3

public class Weekdays {

	public static void main(String[] args) {
		String arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number(0to6) :");
		int n=obj.nextInt();
		
		try {
			String dayname=getday(arr,n);
			System.out.println("The Week is '"+dayname+"'");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Day position should be between 0 and 6.\r\n");
		}
		

	}
	public static String getday(String[] arr,int n) {
		return arr[n];
		
	}

}
