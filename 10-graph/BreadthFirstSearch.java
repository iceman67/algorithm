// ���α׷� 4.3: �־��� ������ �׷����� �ʺ� �켱 Ž������ ��ȸ�Ѵ�
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	private Queue<Node> queue;	// �湮�� �������� �����ϴ� ť

	public BreadthFirstSearch()
	{
		queue = new LinkedList<Node>();
	}

	public void bfs(Node v)
	{
		// v�� '�湮��'���� ǥ���Ѵ�
		v.visited = true;

		// v�� ť�� �߰��Ѵ�
		queue.add(v);



		while (!queue.isEmpty())
		{
			// ť�� �� �տ� �ִ� ������ ������ ���� element�� �����Ѵ�
			Node element = queue.remove();

			// element�� ������ �����͸� ����Ѵ�
			System.out.print(element.info + "  ");

			// element�� ������ �������� ���� ����� ������ ����
			List<Node> neighbours = element.getNeighbours();

			// element�� ������ �湮���� ���� ��� �����鿡 ���� �ʺ� �켱 Ž���� �����Ѵ�
			for (int i = 0; i < neighbours.size(); i++) {
				Node w = neighbours.get(i);  // w�� element�� ������ �����̴�

				if(w != null && !w.visited) // w�� '�湮 ����'���� ǥ�õǾ� �ִ� ���
				{
					w.visited = true;	// w�� '�湮��'���� ǥ���Ѵ�
					queue.add(w);		// w�� ť�� �߰��Ѵ�
				}
			}
		}
	}

	public static void main(String arg[])
	{
		// �־��� ������ �׷����� ���� ������� ǥ���Ѵ�

		// �������� ǥ���Ѵ�
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);

		// �������� ǥ���Ѵ�
		node1.addNeighbours(node2);
		node1.addNeighbours(node5);
		node1.addNeighbours(node8);
		node2.addNeighbours(node1);
		node2.addNeighbours(node3);
		node2.addNeighbours(node4);
		node3.addNeighbours(node2);
		node3.addNeighbours(node4);
		node4.addNeighbours(node2);
		node5.addNeighbours(node1);
		node5.addNeighbours(node6);
		node5.addNeighbours(node7);
		node5.addNeighbours(node8);
		node6.addNeighbours(node5);
		node6.addNeighbours(node7);
		node7.addNeighbours(node5);
		node7.addNeighbours(node6);
		node8.addNeighbours(node1);
		node8.addNeighbours(node5);

		BreadthFirstSearch bfsExample = new BreadthFirstSearch();

		// �־��� ������ �׷����� �ʺ� �켱 Ž������ ��ȸ�Ѵ�
		System.out.println("�ʺ� �켱 Ž�� ���� ���");
		bfsExample.bfs(node1);
	}
}