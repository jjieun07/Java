import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;

public class ButtonPanel extends JPanel {
	private JButton start;
	public int startX;
	private int startY;
	private int endX;
	private int endY;
	private Astar astar;
	private MiroPanel miroPanel;
	private JOptionPane optionPane;
	private JPPanel arr[][];

	public ButtonPanel(Astar astar, MiroPanel miroPanel) {
		this.astar = astar;
		this.miroPanel = miroPanel;
		this.arr = miroPanel.getArr();
		start = new JButton("start");
		Dimension windowsSize = getSize();

		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				astar.init();
				miroPanel.init();

				setStartPoint();
				setEndPoint();

				astar.start = astar.arr[startX][startY];
				astar.end = astar.arr[endX][endY];

				arr[endX][endY].setText("END");
				arr[endX][endY].setBackground(Color.GREEN);

				arr[startX][startY].setText("START");
				arr[startX][startY].setBackground(Color.RED);

				/*
				 * System.out.println("=====button===="); System.out.println(startX + " " +
				 * startY); System.out.println(endX + " " + endY);
				 */
//				System.out.println("==================");

				LinkedList<Node> path = astar.start();

				try {
					if (path == null) {
						optionPane = new JOptionPane();
						optionPane.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/3 - getSize().width/3),
								(Toolkit.getDefaultToolkit().getScreenSize().height/3 - getSize().height/3));
						optionPane.showMessageDialog(null, "경로를 찾지 못하였습니다", "오류", JOptionPane.ERROR_MESSAGE);
						System.out.println("경로를 찾지 못하였습니다.");

					} else {
						for (Node item : path) {
							System.out.println(item.x + ", " + item.y);
						}
					}
					
					miroPanel.showPath();

				} catch (Exception e2) {
					return;
				}

				
			}
		});
		add(start);
	}

	public void setStartPoint() {
		while (true) {

			startX = (int) (Math.random() * 10);
			startY = (int) (Math.random() * 10);

			if (astar.arr[startX][startY].isWall == false)
				break;
		}
	}

	public void setEndPoint() {
		while (true) {
			endX = (int) (Math.random() * 10);
			endY = (int) (Math.random() * 10);

			if (astar.arr[endX][endY].isWall == false)
				break;
		}
	}
}
