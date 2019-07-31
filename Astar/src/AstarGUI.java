import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.Closeable;
import java.util.LinkedList;

public class AstarGUI extends JFrame {
	private Astar astar;
	private MiroPanel miroPanel;
	private ButtonPanel buttonPanel;
	
	public AstarGUI(Astar astar) {
		this.astar = astar;
		
		Container c = getContentPane();
		c = getContentPane();
		c.setLayout(new BorderLayout());

		miroPanel = new MiroPanel(astar);
		buttonPanel = new ButtonPanel(astar, miroPanel);
		
		c.add(miroPanel, BorderLayout.CENTER);
		c.add(buttonPanel, BorderLayout.SOUTH);

		
		//setLocationRelativeTo(null);
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/4 - getSize().width/4),
				(Toolkit.getDefaultToolkit().getScreenSize().height/4 - getSize().height/4));
		setVisible(true);
		setSize(600, 600);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
}
