import java.util.Stack;

public class AdvancedLoops {
	public static void main(String[] args) {
		AdvancedLoops test = new AdvancedLoops();
		//Exercise 1
		test.exercise1and2(31);
	}
	
	public void exercise1and2(int n) {
		int number = n;
		Stack<Integer> reverse = new Stack<Integer>();
		String sequence = "";
		while (number > 0) {
			if (number % 2 == 0) {
				number /= 2;
				reverse.push(number);
				System.out.println(reverse.size() + "a");
			}
			else {
				number -= 1;
				number /= 2;
				reverse.push(number);
				System.out.println(reverse.size() + "b");
			}
		}
		for (int i = 0; i <= reverse.size() + 3; i++) {
			sequence += reverse.pop() + ", ";
		}
		System.out.println(sequence);
	}
}
