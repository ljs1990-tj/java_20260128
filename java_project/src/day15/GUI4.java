package day15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI4 extends JFrame{
	public GUI4() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		c.add(BorderLayout.EAST, btn1);
		c.add(BorderLayout.WEST, btn2);
		c.add(BorderLayout.NORTH,btn3);
		c.add(BorderLayout.SOUTH,btn4);
		c.add(BorderLayout.CENTER,btn5);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI4();
	}

}
