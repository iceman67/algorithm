import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
Input :  
3 3
1 2 1
2 3 2
1 3 3
Output :
3

Input: 
4 4
1 2 1
2 3 2
2 4 4
3 4 1
Output: 
4
 */

public class Prim {
	
	static int V, E;
	static ArrayList<Node>[] adj;
	
	static class Node implements Comparable<Node> {
		int to, weight;
		
		Node(int to, int weight) {
			super();
			this.to = to;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.weight, o.weight);
		}
		
	}
	private static long prim() {
		boolean[] visited = new boolean[V + 1];
		PriorityQueue<Node> pq = new PriorityQueue<>();
		// 1번 노드부터 출발
		pq.add(new Node(1, 0));
		long res = 0;
		int cnt = 0;
		while(!pq.isEmpty()) {
			 Node edge = pq.poll();
	         // 이미 확인한 정점이면 pass
			 if(visited[edge.to]) continue;
			 
		     res += edge.weight;
		     visited[edge.to] = true;
		     // 모든 노드를 방문했다면 return 
		     if(++cnt == V) return res;
		     
		     for (int i = 0; i < adj[edge.to].size(); i++) {
		    	 Node next = adj[edge.to].get(i);
		    	 if(visited[next.to]) continue;	 
		    	 pq.add(next);
		     }    
		}
		return res;
	} 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 정점 개수
		V = Integer.parseInt(st.nextToken());
		// 간선 개수   
		E = Integer.parseInt(st.nextToken());
		
		adj = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++){
			adj[i] = new ArrayList<>();
		}
		
		// Edge 정보 입력
		for (int i = 0; i < E; i++) { 
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			// 인접 리스트
			
			adj[a].add(new Node(b, c));
			adj[b].add(new Node(a, c));
		}
		 
		System.out.println(prim());
		
	}	 		
	
}