
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 7, 8, 9};
        
		int last = arr[arr.length -1];
		
		for(int i = arr.length-1; i > 0 ; i--) 
			arr[i] = arr[i-1];
		
		arr[0] = last;
	     
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
