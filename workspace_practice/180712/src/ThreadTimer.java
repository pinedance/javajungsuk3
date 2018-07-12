import java.awt.*;
import javax.swing.*;
import thread.*;

public class ThreadTimer extends JFrame{
	
	public ThreadTimer() {
		setTitle("Thread를상속받은타이머스레드예제");
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
		th1.start(); // 타이머스레드의실행을시작하게한다.
		th2.start(); // 타이머스레드의실행을시작하게한다.
		th3.start(); // 타이머스레드의실행을시작하게한다.
	}
	
	public static void main(String[] args) {
		new ThreadTimer();
	}
}