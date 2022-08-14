import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 7, 7};
		 
		 System.out.println("original array : " + Arrays.toString(arr));
	     int last = removeDuplicateUsingSorting(arr);
	     
	     for (int i = 0; i < last; i++)
	    	 System.out.print(arr[i] + "  ");
	     
	     System.out.println();
	     
	     int[] slicedArray = Arrays.copyOfRange(arr, 0, last);  
	     System.out.println("remove duplicate : " + Arrays.toString(slicedArray));
	}
	
	
	private static int removeDuplicateUsingSorting(int[] arr) {
		// TODO Auto-generated method stub
		
		
		//Sort an unsorted array
        Arrays.sort(arr);
        
		int j = 0;
		int len = arr.length;
		
		for (int i = 0; i < len - 1; i++) {
			if (arr[i]  != arr[i+1])
				arr[j++] = arr[i];
		}
		
		// Last element of an array
		arr[j++] = arr[len-1];
		return j;
	}

}
