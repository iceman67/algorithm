import java.util.Arrays;

public class Smallest_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {-10, 24, 50, -80, 99999};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] >largest) {
				largest = numbers[i];
			}
			else  if (numbers[i] <smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("\nGiven array is : " + Arrays.toString(numbers));
		System.out.println("Largest number is : " + largest);
		System.out.println("Smallest number is : " + smallest);

	}

}
