import java.util.Arrays;

public class SectSort {

	
	static int theLargest(int [] arr, int last)
	{
	    int max;
	    int ret;

	    max = arr[0];
	    ret = 0;
	    for (int i = 1; i <= last; i++)
	    {
	        if (arr[i] > max)
	        {
	            max = arr[i];
	            ret = i;
	        }
	    }
	    return (ret);
	}
	static void swap(int[] a, int f, int r) {
		int temp;
	    temp = a[f];
	    a[f] = a[r];
	    a[r] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 6, 4, 1, 2, -1};
		int size = arr.length;
	
		
		System.out.println("original array : " + Arrays.toString(arr));
		
		int largest_index = 0;
	    for (int i = size - 1; i > 0; i--)
	    {
	    	largest_index = theLargest(arr, i);
	        swap(arr, largest_index, i);
	    }
	    
	    System.out.println("sorted array : " + Arrays.toString(arr));
		

	}

}
