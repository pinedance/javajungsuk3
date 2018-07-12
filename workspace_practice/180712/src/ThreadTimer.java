import java.awt.*;
import javax.swing.*;
import thread.*;

public class ThreadTimer extends JFrame{
	
	public ThreadTimer() {
		setTitle("Thread����ӹ���Ÿ�̸ӽ����忹��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel1= new JLabel();
		timerLabel1.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel1);
		TimerThread th1= new TimerThread(timerLabel1);
		
		JLabel timerLabel2= new JLabel();
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel2);
		TimerThread th2= new TimerThread(timerLabel2);
		
		JLabel timerLabel3= new JLabel();
		timerLabel3.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel3);
		TimerThread th3= new TimerThread(timerLabel3);
		
		setSize(250,250);
		setVisible(true);
		th1.start(); // Ÿ�̸ӽ������ǽ����������ϰ��Ѵ�.
		th2.start(); // Ÿ�̸ӽ������ǽ����������ϰ��Ѵ�.
		th3.start(); // Ÿ�̸ӽ������ǽ����������ϰ��Ѵ�.
	}
	
	public static void main(String[] args) {
		new ThreadTimer();
	}
}