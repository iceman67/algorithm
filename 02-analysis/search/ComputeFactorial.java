// ���α׷� 2.2: �ڿ����� ��� ���
public class ComputeFactorial {

	public static void main(String[] args) {
		int answer;
		int n = 10;

		answer = factorial(n);

		System.out.println(n + "�� ��� = " + answer);
	}

	// �ڿ����� ����� ��������� ����Ѵ�
	public static int factorial(int n)
	{
		if(n == 0) return 1;
	    else return n * factorial(n - 1);
	}
}
