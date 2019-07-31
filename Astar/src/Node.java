
public class Node {
	int x;
	int y;
	int g;	// 부모로부터 자신까지 거리
	int h;	// 자신부터 끝까지 거리
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
