package listener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import listener.*;

public class IndepClassListener extends JFrame{

	public IndepClassListener(){
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener( ));
		c.add(btn);

// �͸�Ŭ����		
//		bt.addActionListener( new ActionListener() {
//			public bod actionPerformed( ActionEvet e) {
//				JButton b = (JButton)e.getSource();
//				if( b.getText().equals("Action") ) b.setText("�׼�");
//				else b.setText("Action" );
//			}
//		})
		
		
		setSize(250, 120);
		setVisible( true );
	}
	
}

