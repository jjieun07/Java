import java.util.*;

public class Astar {
	Node[][] arr;
	LinkedList<Node> list;
	Node start;
	Node end;
	int width;
	int height;

	Astar() {
		width = 10;
		height = 10;
		arr = new Node[width][height];
		list = new LinkedList<Node>();

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				arr[i][j] = new Node(i, j);
			}
		}

//		start = arr[0][0];		
//		end = arr[width - 1][height - 1];

		
	}
	public void init() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++ ) {
				if(arr[j][i].isWall == true) continue;
				arr[j][i].g = 0;
				arr[j][i].h = 0;
				arr[j][i].visit = false;
				arr[j][i].parent = null;
			}
		}
		if(list.isEmpty() == false)
			list.clear();
		System.out.println("isempty()" + list.isEmpty());
	}
	
	public void setWall(int x, int y, boolean isWall) {
		arr[x][y].isWall = isWall;
	}

	public LinkedList<Node> start() {
		/*
		 * System.out.println("=====astar===="); System.out.println(start.x + " " +
		 * start.y); System.out.println(end.x + " " + end.y);
		 * System.out.println("==================");
		 */
		list.add(start);
		System.out.println(list.contains(start));
		
		while (list.size() != 0) {
			Node current = list.getFirst();
			current.visit = true;
			list.removeFirst();
			
		
			if(current == end) return find(end);

			addNeighbor(current);
			sort();
		}
		return null;
	}

	// g, h계산 하고 이웃노드 추가
	public void addNeighbor(Node current) {
//		System.out.println("이웃찾기");
		int neighbor_h;
		int neighbor_g;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (current.x + i >= 0 && current.y + j >= 0 && current.x + i < 10 && current.y + j < 10) {
					
					Node neighbor = arr[current.x + i][current.y + j];
					neighbor_h = neighbor.h;
					neighbor_g = current.g;

					// neighbor가 벽이 아니면서 방문 한 적 없고 자기 자신이 아님
					if (neighbor.isWall == false && neighbor.visit == false && neighbor != current) {
						// 대각선이면 거리 + 14
						if (i != 0 && j != 0)
							neighbor_g += 14;
						// 아니면 거리 + 10
						else
							neighbor_g += 10;

						// h = (abs(도착지점 x - 현재 x) + abs(도착지점 y - 현재 y)) * 10
						neighbor_h = (Math.abs(end.x - neighbor.x) + Math.abs(end.y - neighbor.y)) * 10;

						// list에 neighbor가 있으면서 기존의 f값이 더 작으면 추가 ㄴㄴ
						if (list.contains(neighbor) && (neighbor.g + neighbor.h < neighbor_g + neighbor_h)) {
							continue;
						} else if(list.contains(neighbor) && (neighbor.g + neighbor.h > neighbor_g + neighbor_h)){
							neighbor.g = neighbor_g;
							neighbor.h = neighbor_h;
							neighbor.parent = current;							
						} else {
							neighbor.g = neighbor_g;
							neighbor.h = neighbor_h;
							neighbor.parent = current;	
							list.add(neighbor);
						}
						
//						if (neighbor.g + neighbor.h < neighbor_g + neighbor_h && neighbor.g + neighbor.h != 0) continue;
//						neighbor.g = neighbor_g;
//						neighbor.h = neighbor_h;
//						neighbor.parent = current;	
//						if (list.contains(neighbor)) continue;
//						list.add(neighbor);
					}
				}
			}
		}
	}

	// list 정렬
	public void sort() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i; j < list.size(); j++) {
				int f1 = list.get(i).g + list.get(i).h;
				int f2 = list.get(j).g + list.get(j).h;

				if (f1 > f2) {
					Node tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
	}

	public LinkedList<Node> find(Node end) {
		LinkedList<Node> path = new LinkedList<Node>();
		Node current = end;
		while (current.parent != null) {
			path.addFirst(current);
			current = current.parent;
		}
		path.add(0, start);
		return path;
	}
}
