// 프로그램 2.2: 자연수의 계승 계산
public class ComputeFactorial {

	public static void main(String[] args) {
		int answer;
		int n = 10;

		answer = factorial(n);

		System.out.println(n + "의 계승 = " + answer);
	}

	// 자연수의 계승을 재귀적으로 계산한다
	public static int factorial(int n)
	{
		if(n == 0) return 1;
	    else return n * factorial(n - 1);
	}
}
