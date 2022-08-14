// ���α׷� 4.4: ��ȯ�� ���� ���� �׷����� ���� ���� ������ �Ѵ�
import java.util.List;
import java.util.Stack;

public class TopologicalSort
{
	Stack<Node> stack;  // �������� �湮�� �������� �����ϴ� ����

	// ��� �ִ� ������ �����Ѵ�
	public TopologicalSort() {
		stack = new Stack<>();
	}

	//  ���� ������ v���� �����Ѵ�
	public void topologicalSort(Node v)
	{
		// ���� v�� ������ �������� ���� ����� ������ ����
		List<Node> neighbours = v.getNeighbours();

		// v�� ������ ��� ������ ���� ���� �켱 Ž���� �Ѵ�
		for (int i = 0; i < neighbours.size(); i++) {
			Node w = neighbours.get(i);

			if(w != null && !w.visited)
			{
				w.visited = true;
				topologicalSort(w);
			}
		}

		// v�� ���ÿ� �о� �ִ´�
		stack.push(v);
	}


	public static void main(String arg[])
	{
		TopologicalSort topological = new TopologicalSort();

		// �־��� ���� �׷����� ���� ������� ǥ���Ѵ�

		// �׷����� ���� �켱 Ž���� �����ϴ� ���� 0�� �߰��Ѵ�
		Node node0 = new Node(0);

		// �׷����� �ִ� �������� �����Ѵ�
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);

		// �������� �߰��Ѵ�

		// ���� 0���� ���� ������ ���� ���� 1�� ���� ������ �߰��Ѵ�
		node0.addNeighbours(node1);

		// ���� 0���� ���� ������ ���� ���� 3���� ���� ������ �߰��Ѵ�
		node0.addNeighbours(node3);

		// �׷����� �������� ��Ÿ����
		node1.addNeighbours(node2);
		node1.addNeighbours(node4);
		node2.addNeighbours(node4);
		node2.addNeighbours(node6);
		node3.addNeighbours(node4);
		node3.addNeighbours(node5);
		node4.addNeighbours(node6);
		node5.addNeighbours(node6);
		node5.addNeighbours(node7);
		node6.addNeighbours(node7);

		System.out.println("���� ���� ����:");

		// ���� ���� node0�� '�湮��'���� ǥ���Ѵ�
		node0.visited = true;

		// node0���� ���� ������ �����Ѵ�
		topological.topologicalSort(node0);

		// ������ ���� �´�
		Stack<Node> resultStack = topological.stack;

		// ���ÿ� �ִ� ������ ����Ѵ�
		while (resultStack.empty() == false)
			System.out.print(resultStack.pop() + "  ");
	}
}