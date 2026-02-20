package day15;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI5 extends JFrame{
	public GUI5() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "번 버튼");
			btn.setSize(100, 20);
			btn.setLocation(i*15, i*15);
			c.add(btn);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI5();
	}

}
