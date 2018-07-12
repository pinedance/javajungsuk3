package panel;

import javax.swing.*;
import java.awt.*;

public class PaintJPanel extends JFrame {
	
	public PaintJPanel(){
		setTitle("JPanel¿« paintComponent() øπ¡¶");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setContentPane( new MyPanel() );
		setSize(250, 250);
		setVisible( true );
	}
	
}
