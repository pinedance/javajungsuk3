package panel;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(10, 10, 50, 50);
		g.drawRect(50, 50, 50, 50);
		
		g.setColor(Color.MAGENTA);
		g.drawRect(90, 90, 50, 50);
	}
	
}
