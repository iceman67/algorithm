import java.util.Scanner;

public class Fibonacci {
	
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
        System.out.println(fibonacci(N));

	}

}
