
public class WhileLoopPuzzles {
	public static void main(String[] args) {
		//Exercise 1
		int numDollars = 1;
		int years = 0;
		while (numDollars < 1000000) {
			years += 1;
			numDollars *= 2;
		}
		System.out.println("It will take you " + years + " years to become a millionaire");
		
		//Exercise 2
//		String zebra = "black, white, ";
//		while (0 == 0) {
//			System.out.print(zebra);
//		}
		
		//Exercise 3
		int numSlices = 1046;
		int timesRemove = 0;
		while (numSlices > 1) {
			numSlices /= 2;
			timesRemove += 1;
		}
		System.out.println("You can remove half of the slices " + timesRemove + " times.");
		
		
		//Excercise 3
		//Tortoise Walk of Fame (In the Starz class)
		
		//Exercise 4
		//Advanced Loops
	}
}
