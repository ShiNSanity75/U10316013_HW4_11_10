/**
 * ID:U10316013
 * NAME:HSIAO,TZU-CHI
 * EX:11.10
 */
import java.util.Scanner;

public class TestStack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//create a scanner
    
		MyStack hahaStack = new MyStack();//new MyStack
    
		//point user to enter a string
		System.out.println("Please enter five strings : ");
		
		//add a new element to the top of the stack
		for (int i = 0; i < 5; i++) {
			hahaStack.push(input.nextLine());
		}//end for loop
    
		System.out.println("You enter " + hahaStack.getSize() + " strings" + "\nThe opposite strings are: ");
		
		while (!hahaStack.isEmpty()) {
			System.out.println(hahaStack.pop());//return and remove the top element in the stack
		}
	}
}

class MyStack extends java.util.ArrayList<Object> {

	//is the stack empty?
	public boolean isEmpty() {
		return super.isEmpty();
	}

	//get the number of the elements 
	public int getSize() {
		return size();
	}

	//return the top element in the stack
	public Object peek() {
		return get(getSize() - 1);
	}

	//return and remove the top element in the stack
	public Object pop() {
		Object o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}

	//add a new element to the top of the stack
	public Object push(Object o) {
		add(o);
		return o;
	}

	@Override
	public String toString() {
		return "stack: " + toString();
	}
}
