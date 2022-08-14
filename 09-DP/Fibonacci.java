import java.util.Scanner;


/* Memoization, an optimization technique that makes applications more efficient and faster
 * by storing computation results in cache, and retrieving that same information 
 * from the cache the next time it's needed instead of computing it again
 * 
 *  Top down :  recursive 
 *  Bottom up : iteration
 */
public class Fibonacci {
	
	static int[] dp = new int[1000];
	
	static int fibonacci_dp(int n){
		if(n == 1) return 1;
        if(n == 2) return 1;
        if(dp[n] != 0) return dp[n];
        dp[n] = fibonacci_dp(n - 2) + fibonacci_dp(n - 1);
        return dp[n];
    }
	
	static int fibonacci_dp2(int n){
		dp[1] = 1;
        for(int i = 2;i <= n;i++)
        	dp[i] = dp[i - 1] + dp[i - 2];
        //System.out.println(dp[n]);
        return dp[n];
    }
	
	static int fibonacci(int n){
    	if(n == 1) return 1;
        if(n == 2) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input fibonacci number : ");
        int N = sc.nextInt();
        //System.out.println(fibonacci(N));
        //System.out.println(fibonacci_dp(N));
        System.out.println(fibonacci_dp2(N));


	}

}
