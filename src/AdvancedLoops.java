import java.util.Stack;

public class AdvancedLoops {
	public static void main(String[] args) {
		AdvancedLoops test = new AdvancedLoops();
		//Exercise 1
		test.exercise1and2(22);
	}
	
	public void exercise1and2(int n) {
		Stack<Integer> reverse = new Stack<Integer>();
		String sequence = "";
		//while (n > 0) {
			if (n % 2 == 0) {
				n /= 2;
				reverse.push(n);
			}
			else {
				n -= 1;
				n /= 2;
				reverse.push(n);
			}
		//}
		//for (int i = 0; i < reverse.size(); i++) {
			//sequence += reverse.pop() + ", ";
		//}
		System.out.println(n);
	}
}
