
public class Node {
	int x;
	int y;
	int g;	// �θ�κ��� �ڽű��� �Ÿ�
	int h;	// �ڽź��� ������ �Ÿ�
	boolean visit;
	boolean isWall;
	Node parent;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		g = 0;
		h = 0;
		visit = false;
		isWall = false;
		parent = null;
	}
}
