import java.util.Arrays;

/*
  It takes O(logn) for heapify and O(n) for constructing a heap. 
  Hence, the overall time complexity of heap sort using min heap or max heap is O(nlogn)
  
  
  I rewrite a heap sort program written in c  to a java one 
  https://github.com/JehPark/easy-learn-algo/tree/main/chap04/advSort
  
  
 */


public class HeapSort {
	
	static void heapify(int []arr, int root, int last)
	{
	    int left, right, smaller;

	    // Initialize smallest as root
	    
	    left = root * 2;
	    right = root * 2 + 1;
	    smaller = 0; 
	    
	    // If right child is smaller than root
	    if (right <= last)
	    {
	        if (arr[left] < arr[right])
	            smaller = left;
	        else
	            smaller = right;
	    }
	    else if (left <= last)
	        smaller = left;
	    else
	        return;
	    
	    // If smallest is not root
	    if (arr[smaller] < arr[root])
	    {
	        int temp = arr[root];
	        arr[root] = arr[smaller];
	        arr[smaller] = temp;
	        
	        // Recursively heapify the affected sub-tree
	        heapify(arr, smaller, last);
	    }
	}
	
	static void buildheap(int [] arr, int size)
	{
	    for (int i = (size - 1) / 2; i >= 0; i--)
	        heapify(arr, i, size - 1);
	}

	// it is used to sort a given array for descending order using min heap 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 6, 4, 1, 2, -1};
		int size = arr.length;
	
		System.out.println("original array : " + Arrays.toString(arr));
			
		buildheap(arr, size);
		for (int i = size - 1; i > 0; i--)
		{
		        int tmp = arr[0];
		        arr[0] = arr[i];
		        arr[i] = tmp;
		        heapify(arr, 0, i - 1);
		}
		System.out.println("sorted array : " + Arrays.toString(arr));

	}

}
