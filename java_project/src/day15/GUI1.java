package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 extends JFrame{
	public GUI1() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		
		c.add(btn1);
		c.add(btn2);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI1();
	}

}
