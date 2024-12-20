// 프로그램 4.1: 주어진 무방향 그래프를 깊이 우선 탐색으로 순회한다
import java.util.List;

public class DepthFirstSearch {
	// 정점 v에 연결된 방문하지 않은 정점들을 깊이 우선 탐색을 이용하여 재귀적으로 방문한다
	public static void dfs(Node v)
	{
		// 정점 v에 대응된 데이터를 출력한다
		System.out.print(v.info + " ");

        // 정점 v를 '방문함'으로 표기한다
		v.visited = true;

		// 정점 v에 인접한 정점들의 연결 목록을 끄집어 낸다
		List<Node> neighbours = v.getNeighbours();

		// 정점 v에 인접한 방문하지 않은 모든 정점들에 대해 깊이 우선 탐색을 수행한다
		for (int i = 0; i < neighbours.size(); i++) {
			Node w = neighbours.get(i);

			if(w != null && !w.visited)
				dfs(w);
		}
	}

	public static void main(String arg[])
	{
		// 주어진 무방향 그래프를 연결 목록으로 표현한다

		// 정점들을 표현한다
		Node[] node = new Node[6];

		for (int i = 0; i < 6; i++)
		    node[i] = new Node(i + 1);

		// 간선들을 표현한다
		node[0].addNeighbours(node[1]);
		node[0].addNeighbours(node[2]);
		node[0].addNeighbours(node[4]);
		node[1].addNeighbours(node[0]);
		node[1].addNeighbours(node[2]);
		node[2].addNeighbours(node[0]);
		node[2].addNeighbours(node[1]);
		node[2].addNeighbours(node[3]);
		node[2].addNeighbours(node[4]);
		node[3].addNeighbours(node[2]);
		node[3].addNeighbours(node[5]);
		node[4].addNeighbours(node[0]);
		node[4].addNeighbours(node[2]);
		node[5].addNeighbours(node[2]);
		node[5].addNeighbours(node[3]);

		// 주어진 무방향 그래프를 깊이 우선 탐색으로 순회한다
		System.out.println("재귀를 사용한 깊이 우선 탐색 실행 결과");
		dfs(node[0]);
	}
}