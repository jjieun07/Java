import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPPanel extends JPanel {
	private String text;
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Arial", Font.BOLD, 15));
		if (text != null)
			g.drawString(text, 5, 30);
	}
}
