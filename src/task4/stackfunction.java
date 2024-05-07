package task4;
import java.util.*;

//Question no 5

public class stackfunction {
	
	public int addElement(Stack stk,  int element) {
		stk.push(element);
		System.out.println("Element Added");
		return element;
		}

	public void removeElement(Stack stk) {
	stk.pop();
	System.out.println("-->Top element removed!!!");
	}

	public void displayinfo(Stack stk) {
	int size=stk.size();
	System.out.print("\n\nThe elements in Stack are :\n");
	for(int i=0;i<size;i++) {
		System.out.print(stk.get(i)+" ");
		}
	}
public static void main(String[] args) {
	Stack<Integer> stk= new Stack<>();  
	stackfunction stackfun=new stackfunction();
	stackfun.addElement(stk,89);
	stackfun.addElement(stk,70);
	stackfun.addElement(stk,55);
	stackfun.addElement(stk,48);
	stackfun.addElement(stk,39);
	
	stackfun.displayinfo(stk);
	
	stackfun.removeElement(stk);

	stackfun.displayinfo(stk);	
	}

}
