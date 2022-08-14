import java.util.Scanner;

// Reverse an Array without using Another Array

public class ReverseArrary {
	
	public static void reverse(int[] arr) {
		 
        //Declare two variables start and end
        int start = 0;
        int end = arr.length - 1;
    
       //Run a loop while start is less than end
        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
         }
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Enter the size of array : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter an array values");
		
		for (int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}
		//int[] arr = {1, 7, 8, 9};
        reverse(arr);

        System.out.println(" After reversing an array ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
