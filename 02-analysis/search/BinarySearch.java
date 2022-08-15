// ���α׷� 2.3: ���� Ž��
public class BinarySearch {

	public static void main(String[] args) {
		int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
		int x = 18;
		int n = A.length;
		int location;

		location = binarySearch(A, 0, n - 1, x);

		System.out.println(x + "�� ���� = " + location);
	}

	// target�� �迭 A[first .. last]���� �ִ����� Ȯ���ϱ� ���� ���� Ž���� ����Ѵ�
	// �Ű� ����: �迭 A[first .. last], target(ã�� ��)
	// ��ȯ��: ������ �ش� ����� ����, ������ -1
	public static int binarySearch(int[] A, int first, int last, int target)
    {
        int result;

        if (first > last) // ã�� ���� ���
            result = -1;
        else
        {
	        // �߰� ����� ������ ���Ѵ�
            int mid = (first + last) / 2;

            if (target == A[mid]) // target�� �߰� ��ҿ� ���� ã�� ���
                result = mid;
            else if (target < A[mid]) // target�� �߰� ��Һ��� �۴ٸ� ���� �ݿ��� ã����
                result = binarySearch(A, first, mid - 1, target);
            else // target�� �߰� ��Һ��� ũ�ٸ� ���� �ݿ��� ã����
                result = binarySearch(A, mid + 1, last, target);
        }
        return result;
    }
}