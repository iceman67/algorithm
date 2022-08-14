
// right rotate the elements of an array by the specified number of times
// https://www.techcrashcourse.com/2016/07/program-for-array-rotation-N-positions.html

/*
array = [1,2,3,4,5,6]
let last = array.removeLast()
array.insert(last, at: 0)
 */
public class RotateArrayN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 7, 8, 9};
        int n = 2;
        
        System.out.println("Original array: ");    
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
        	int last = arr[arr.length -1];
		
		    for(int j = arr.length-1; j > 0 ; j--) 
	  		     arr[j] = arr[j-1];
		    arr[0] = last;
        }
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        

	}

}
