import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateHash {
	
	public static void removeDuplicateUsingHashing(int arr[]) {
		//Declare a hashmap
		Map<Integer, Integer> map = new HashMap<>();
		int len = arr.length;
		
		//Traverse an array
		for (int i = 0; i < len - 1; i++) { 
			//If key is already present in a map 
			if (map.containsKey(arr[i])) { 
				//Increment it's count 
				map.put(arr[i], map.get(arr[i]) + 1); 
			} else { 
				/* If it's not present in a map 
				 * then put a key and it's initial count 1 
				 */ 
				map.put(arr[i], 1); 
			} 
		}
		//Print Each Key 
		map.forEach((k, v) -> System.out.print(k + " "));
	} 
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 7 };
		System.out.println("original array : " + Arrays.toString(arr));
		removeDuplicateUsingHashing(arr);
		

	}

}
