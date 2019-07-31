import java.util.LinkedList;

public class Main {
	public static void main(String args[]) {
		Astar astar = new Astar();

		astar.setWall(4, 6, true);
		astar.setWall(1, 1, true);
		astar.setWall(1, 2, true);
		astar.setWall(1, 3, true);
		astar.setWall(1, 4, true);
		astar.setWall(1, 5, true);
		astar.setWall(1, 6, true);
		astar.setWall(1, 7, true);
		astar.setWall(1, 8, true);
		astar.setWall(1, 9, true);
		astar.setWall(3, 0, true);
		astar.setWall(3, 1, true);
		astar.setWall(3, 2, true);
		astar.setWall(3, 3, true);
		astar.setWall(3, 4, true);
		astar.setWall(3, 5, true);
		astar.setWall(4, 5, true);
		astar.setWall(5, 5, true);
		astar.setWall(5, 3, true);
		astar.setWall(6, 3, true);
		astar.setWall(6, 5, true);
		astar.setWall(4, 7, true);
		astar.setWall(4, 8, true);
		astar.setWall(4, 9, true);
		astar.setWall(5, 7, true);
		astar.setWall(6, 7, true);
		astar.setWall(8, 2, true);
		astar.setWall(8, 3, true);
		astar.setWall(8, 4, true);
		astar.setWall(8, 5, true);
		astar.setWall(8, 6, true);
		astar.setWall(8, 7, true);
		astar.setWall(8, 8, true);
		astar.setWall(8, 9, true);

		
		AstarGUI gui = new AstarGUI(astar);
		

	}
}
