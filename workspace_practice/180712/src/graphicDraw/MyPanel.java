package graphicDraw;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyPanel extends JPanel {
	Point start = null, end = null;
	
	public MyPanel() {
		MyMouseListener listener = new MyMouseListener();
		addMouseListener( listener );
		addMouseMotionListener( listener );
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if( start == null ) return;
		g.setColor( Color.BLUE );
		int x = Math.min( start.x,  end.x );
		int y = Math.min( start.x,  end.x );
		int width = Math.abs(start.x - start.y);
		g.drawOval(x,  y, width, height);
		
	}
}
