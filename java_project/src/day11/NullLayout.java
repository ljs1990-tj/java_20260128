package day11;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayout extends JFrame{

	public NullLayout() {
		// TODO Auto-generated constructor stub
		setTitle("z");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello Java");
		label.setSize(200, 20);
		label.setLocation(200, 150);
		c.add(label);
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "번 버튼");
			btn.setLocation(i * 20, i * 20);
			btn.setSize(100, 20);
			c.add(btn);
		}
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullLayout();
	}

}
