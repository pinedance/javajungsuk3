package graphicDraw;

import java.awt.event.*;

public class MyMouseListener extends MouseAdapter {
	
	public void mousePressed(MouseEvent e) {
		start = e.getPoint();
	}
	
	public void mouseDragged(MouseEvent e) {
		end = e.getPoint();
		repaint();
	}
	
	
	
}
