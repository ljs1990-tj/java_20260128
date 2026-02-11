package day11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("ㅋㅋㅋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.EAST);
		c.add(btn3, BorderLayout.CENTER);
		
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
