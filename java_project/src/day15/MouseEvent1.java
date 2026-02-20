package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame{
	public MouseEvent1() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA");
		label.setSize(50, 20);
		label.setLocation(50, 50);
		c.add(label);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getClickCount() == 2) {
					Random ran = new Random();
					int r = ran.nextInt(256);
					int g = ran.nextInt(256);
					int b = ran.nextInt(256);
					c.setBackground(new Color(r, g, b));
				}
			}
		});
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent1();
	}

}
