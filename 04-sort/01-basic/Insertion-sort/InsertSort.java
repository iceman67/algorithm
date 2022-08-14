import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 6, 4, 1, 2, -1};
		int size = arr.length;
		
		System.out.println("original array : " + Arrays.toString(arr));
		
		// We assume that first element is located in a correct position
		
		for (int i = 1; i < size; i++)
	    {
	        int loc = i - 1; 
	        int newitem = arr[i];
	        while (loc >= 0 && newitem < arr[loc])
	        {
	            arr[loc + 1] = arr[loc];
	            loc--;
	        }
	        arr[loc + 1] = newitem;
	    }
		
		
		System.out.println("Sorted array : " + Arrays.toString(arr));
		 
		

	}

}
