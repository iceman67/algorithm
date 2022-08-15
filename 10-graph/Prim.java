import java.io.*;
import java.util.Arrays;

public class Prim {
	/*
	 * 간선이 많은 경우 Prim이 유리하고 
	 * 인접행렬을 사용하는 것이 유용함
	 * 프림 + 인접행렬 궁합 좋음
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1[] = br.readLine().split(" ");
		int V = Integer.parseInt(input1[0]); // 정점의 개수
		int E = Integer.parseInt(input1[1]); // 간선의 개수
		// 정점의 정보 2개 + 이들의 가중치 순으로 입력이 들어옴.
		int adj[][] = new int[V][V]; 
		int result = 0;
		
		// 간선의 정보와 가중치 입력 받기
		for(int i = 0; i < E; i++) {
			String input2[] = br.readLine().split(" ");
			int a = Integer.parseInt(input2[0]) - 1;
			int b = Integer.parseInt(input2[1]) - 1;
			int c = Integer.parseInt(input2[2]);
			// 인접 행렬 구성
			adj[a][b] = c;
			adj[b][a] = c;
		}
		
		// 선택되었는지 아닌지 판단하기 위한 boolean 배열
		boolean visited[] = new boolean[V];
		// 현재 선택된 정점들로부터 도달할 수 있는 최소 거리 저장 배열
		int distance[] = new int[V];
		
		// 모두 최대 값으로 key를 갱신
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		distance[0] = 0; // 처음 선택한 정점은 거리 0
		int cnt = 0;
		
		while(true) {
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for(int i = 0; i < V; i++) {
				// 선택되지 않았고 거리를 저장한 key보다 작은 경우 갱신
				if(!visited[i] && distance[i] < min) {
					idx = i;
					min = distance[i];
				}
			}
			
			// 선택된 정점에 포함시킴
			visited[idx] = true;
            // 결과값에 가중치 덧셈
			result += min;
			cnt++;
			
            // cnt가 V랑 같아지면 모든 정점을 처리한 것이므로 종료
			if(cnt == V) break;
			
            // 새로 추가한 정점으로부터 연결되어 있는 다른 정점의 간선 정보 업데이트
			for(int i = 0; i < V; i++) {
				if(!visited[i] && adj[idx][i] > 0 && distance[i] > adj[idx][i]) {
					distance[i] = adj[idx][i];
				}
			}
		}
		
		System.out.println(result);
	}
}