import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class MiroPanel extends JPanel {
	private int width;
	private int height;
	private Astar astar;
	public JPPanel arr[][];
	
	public MiroPanel(Astar astar) {
		this.astar = astar;
		width = 10;
		height = 10;
		
		setLayout(new GridLayout(width, height));
		
		arr = new JPPanel[width][height];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				arr[j][i] = new JPPanel();
				arr[j][i].setBorder(new LineBorder(Color.WHITE));
				add(arr[j][i]);
			}
		}
		setColor();
//		showPath();

	}
	
	public void init() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if(astar.arr[j][i].isWall == true) continue;
				arr[j][i].setBackground(this.getBackground());
				arr[j][i].setText(null);
			}
		}
	}
	
	public void setColor() {
		
		for (int i = 0; i < height; i++) {		//  yÃà
			for (int j = 0; j < width; j++) {	//	xÃà
				if (astar.arr[j][i].isWall == true) {
					arr[j][i].setBackground(Color.GRAY);
				}
			}
		}
	}
	
	public JPPanel[][] getArr() {
		return arr;
	}
	
	public void showPath() {
		Node parent = astar.end.parent;

		while (true) {
//			if (parent == astar.end) {
//				arr[parent.x][parent.y].setText("END");
//				arr[parent.x][parent.y].setBackground(Color.GREEN);
//			}
			/* else  if (parent == astar.start) {
//				arr[parent.x][parent.y].setText("START");
//				arr[parent.x][parent.y].setBackground(Color.RED);
				return;
			}
			else*/
			arr[parent.x][parent.y].setBackground(Color.PINK);

			parent = parent.parent;

			if (parent == astar.start)
				return;
		}
	}
}