
/*
 
 WRITTEN in C
 
for (int last = size - 1; last > 0; last--)
    {
        for (int i = 0; i < last; i++)
        {
            if (arr[i] > arr[i + 1])
                swap(arr, i, i + 1);
        }
    }

*/
public class BubbleSort {
	
	static void swap(int[] a, int f, int r) {
		int temp;
	    temp = a[f];
	    a[f] = a[r];
	    a[r] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 4, 1, 2, -1};
		int len = arr.length;
		 
		for(int i = len -1; i >  0; i--) {
			for(int j = 0; j < i; j++) {
				//Logic to swap element
		        if(arr[j] > arr[j+1]) {
		             /*	
		               int temp = arr[j];
		               arr[j] = arr[j+1];
		               arr[j+1] = temp;
		             */
		             swap(arr, j, j+1); 
		        }     
			}       
		}
		 
		for(int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
     }

}
