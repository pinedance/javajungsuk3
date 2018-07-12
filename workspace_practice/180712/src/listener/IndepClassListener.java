package listener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import listener.*;

public class IndepClassListener extends JFrame{

	public IndepClassListener(){
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener( ));
		c.add(btn);

// 익명클레스		
//		bt.addActionListener( new ActionListener() {
//			public bod actionPerformed( ActionEvet e) {
//				JButton b = (JButton)e.getSource();
//				if( b.getText().equals("Action") ) b.setText("액션");
//				else b.setText("Action" );
//			}
//		})
		
		
		setSize(250, 120);
		setVisible( true );
	}
	
}

