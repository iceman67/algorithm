// ���α׷� 4.2: �׷����� �� ������ ��Ÿ����.
import java.util.List;
import java.util.ArrayList;

public class Node
{
	int info;				// ������ ������ ������
	boolean visited;		// �湮 ����
	List<Node> neighbours;	// ������ ������ �������� ���� ���

	// Node ��ü�� �����Ѵ�
	public Node(int info)
	{
		this.info = info;
		this.visited = false;
		this.neighbours = new ArrayList<>();

	}

	// ������ ������ �������� ���� ��Ͽ� �� ������ �߰��Ѵ�
	public void addNeighbours(Node neighboursNode)
	{
		this.neighbours.add(neighboursNode);
	}

	// ������ ������ �������� ���� ����� ��ȯ�Ѵ�
	public List<Node> getNeighbours() {
		return neighbours;
	}

	// ������ ������ �������� ���� ����� �־��� ���� ������� �����Ѵ�
	public void setNeighbours(List<Node> neighbours) {
		this.neighbours = neighbours;
	}

	// ������ ������ �����͸� ��ȯ�Ѵ�
	public String toString()
	{
		return "" + info;
	}
}