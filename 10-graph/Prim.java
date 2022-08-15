import java.io.*;
import java.util.Arrays;

public class Prim {
	/*
	 * ������ ���� ��� Prim�� �����ϰ� 
	 * ��������� ����ϴ� ���� ������
	 * ���� + ������� ���� ����
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1[] = br.readLine().split(" ");
		int V = Integer.parseInt(input1[0]); // ������ ����
		int E = Integer.parseInt(input1[1]); // ������ ����
		// ������ ���� 2�� + �̵��� ����ġ ������ �Է��� ����.
		int adj[][] = new int[V][V]; 
		int result = 0;
		
		// ������ ������ ����ġ �Է� �ޱ�
		for(int i = 0; i < E; i++) {
			String input2[] = br.readLine().split(" ");
			int a = Integer.parseInt(input2[0]) - 1;
			int b = Integer.parseInt(input2[1]) - 1;
			int c = Integer.parseInt(input2[2]);
			// ���� ��� ����
			adj[a][b] = c;
			adj[b][a] = c;
		}
		
		// ���õǾ����� �ƴ��� �Ǵ��ϱ� ���� boolean �迭
		boolean visited[] = new boolean[V];
		// ���� ���õ� ������κ��� ������ �� �ִ� �ּ� �Ÿ� ���� �迭
		int distance[] = new int[V];
		
		// ��� �ִ� ������ key�� ����
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		distance[0] = 0; // ó�� ������ ������ �Ÿ� 0
		int cnt = 0;
		
		while(true) {
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for(int i = 0; i < V; i++) {
				// ���õ��� �ʾҰ� �Ÿ��� ������ key���� ���� ��� ����
				if(!visited[i] && distance[i] < min) {
					idx = i;
					min = distance[i];
				}
			}
			
			// ���õ� ������ ���Խ�Ŵ
			visited[idx] = true;
            // ������� ����ġ ����
			result += min;
			cnt++;
			
            // cnt�� V�� �������� ��� ������ ó���� ���̹Ƿ� ����
			if(cnt == V) break;
			
            // ���� �߰��� �������κ��� ����Ǿ� �ִ� �ٸ� ������ ���� ���� ������Ʈ
			for(int i = 0; i < V; i++) {
				if(!visited[i] && adj[idx][i] > 0 && distance[i] > adj[idx][i]) {
					distance[i] = adj[idx][i];
				}
			}
		}
		
		System.out.println(result);
	}
}