import java.util.Random;


public class AlgoLab {

	static int maxScore(int x[], int n) {
	    int max = x[0];
	    int i = 1;
	    while (i < n) {
	    	if (x[i] > max)
	    		max = x[i];
	    	i++;
	    }
	    return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 500; 

		Random r = new Random();
		int[]x = new int[100];
		
		for (int i = 0; i < x.length; i++)
		{
			x[i] = r.nextInt(MAX);
		}
  		
		int max = maxScore(x, x.length);
		System.out.printf("Max value = %d \n", max);
	}

}
