
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unsorted array
		int num[] = { 1, 9, 5, 55, 8, -1, 3, 55 };
		// Length of an array
		int n = num.length;
		
		// Initialize highest and second highest with minimum integer value
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		//Traverse an array
		for (int i = 0; i < n; i++) { 
			// If greater than highest 
			if (num[i] > highest) {
				// Assign highest value into secondhigest
				secondHighest = highest;
				// Set new highest
				highest = num[i];
			}
			
			// If number is less than highest and greater than secondHighest
			if (num[i] < highest && num[i] > secondHighest) {
				// Set second highest
				secondHighest = num[i];
			}
		}
		System.out.println("Second highest " + secondHighest);
	}

}
