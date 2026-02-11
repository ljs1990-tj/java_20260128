package day11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		// TODO Auto-generated constructor stub
		setTitle("ㅋㅋㅋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		c.setBackground(Color.CYAN);
		
		JButton btn1 = new JButton("안녕?");
		c.add(btn1);
		c.add(new JButton("자바 꿀잼"));
		c.add(new JButton("오라클? ㅎㅎ"));
		c.add(new JButton("자바 꿀잼"));
		c.add(new JButton("자바 꿀잼"));
		
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
