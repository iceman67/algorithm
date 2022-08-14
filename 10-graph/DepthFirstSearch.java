// ���α׷� 4.1: �־��� ������ �׷����� ���� �켱 Ž������ ��ȸ�Ѵ�
import java.util.List;

public class DepthFirstSearch {
	// ���� v�� ����� �湮���� ���� �������� ���� �켱 Ž���� �̿��Ͽ� ��������� �湮�Ѵ�
	public static void dfs(Node v)
	{
		// ���� v�� ������ �����͸� ����Ѵ�
		System.out.print(v.info + " ");

        // ���� v�� '�湮��'���� ǥ���Ѵ�
		v.visited = true;

		// ���� v�� ������ �������� ���� ����� ������ ����
		List<Node> neighbours = v.getNeighbours();

		// ���� v�� ������ �湮���� ���� ��� �����鿡 ���� ���� �켱 Ž���� �����Ѵ�
		for (int i = 0; i < neighbours.size(); i++) {
			Node w = neighbours.get(i);

			if(w != null && !w.visited)
				dfs(w);
		}
	}

	public static void main(String arg[])
	{
		// �־��� ������ �׷����� ���� ������� ǥ���Ѵ�

		// �������� ǥ���Ѵ�
		Node[] node = new Node[6];

		for (int i = 0; i < 6; i++)
		    node[i] = new Node(i + 1);

		// �������� ǥ���Ѵ�
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

		// �־��� ������ �׷����� ���� �켱 Ž������ ��ȸ�Ѵ�
		System.out.println("��͸� ����� ���� �켱 Ž�� ���� ���");
		dfs(node[0]);
	}
}