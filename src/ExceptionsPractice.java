import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionsPractice {
	//1. create a main method to test the other methods
	public static void main(String[] args) {
//		try {
//			new ExceptionsPractice().checkPWord("PD");
//		}
//		catch (SecurityException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			new ExceptionsPractice().calculate(1, 2, "divide");
//		}
//		catch (UnsupportedOperationException e) {
//			e.printStackTrace();
//		}
//		
//		ArrayList<String> list = new ArrayList<String>;
//		
//		for (int i = 0; i < 8; i++) {
//			list.add("a");
//		}
//
//		try {
//			new ExceptionsPractice().printList(list, 3);
//		}
//		catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 8; i++) {
			list.add("a");
		}
		
		try {
			new ExceptionsPractice().range(3, 9, list);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//2. create a method that takes a string and checks if it matches a password of your choice. 
	//     throw a SecurityException if the string does not match the password
	public void checkPWord(String s) throws SecurityException {
		if (!s.equals("PWD")) {
			throw new SecurityException("Error in checkPWord method");
		}
	}
	
	//3. create a method that takes in two ints and a String and returns an int. The string will be 
	//    either "add" "multiply" or "subtract." Return the proper result with the two ints. 
	//    throw an UnsupportedOperation exception if the string does not match a proper operation
	public int calculate(int x, int y, String operation) throws UnsupportedOperationException {
		if (!operation.equals("add") || !operation.equals("multiply") || !operation.equals("subtract")) {
			throw new UnsupportedOperationException("Error in calculate method");
		}
		else if (operation.equals("add")) {
			return x + y;
		}
		else if (operation.equals("multiply")) {
			return x * y;
		}
		else {
			return x - y;
		}
	}
	
	//4. create a mehtod that takes an ArrayList of strings and an int. The method will then print
	//     all the objects from the list starting from the int. Throw an IndexOutOfBoundsException of
	//     the list does not contain that element
	public void printList(List<String> list, int x) throws IndexOutOfBoundsException {
		if (list.size() < x) {
			throw new IndexOutOfBoundsException("Error in printList method");
		}
		for (int i = x; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	//5. create a method that takes 2 ints and an ArrayList. This method will print the range of elements
	//    provided by the two ints. Throw an NumberFormatException if the numbers are not in ascending order.
	public void range(int x, int y, ArrayList<String> list) throws NumberFormatException{
		if (x > y) {
			throw new NumberFormatException("Error in range method");
		}
		else if (list.size() < x || list.size() < y) {
			throw new IndexOutOfBoundsException("Error in range method");
		}
		for (int i = x; i <= y; i++) {
			System.out.println(list.get(i));
		}
	}
	
	//6. Create a class called Vector2D that has two member floats called x and y.
	//     Create a method called normalize that takes in a Vector2D and returns a Vector2D. 
	//     The method should return the normal of the vector. Throw a DivideByZeroException if the
	//     x and y of the passed in vector are both 0.
}
