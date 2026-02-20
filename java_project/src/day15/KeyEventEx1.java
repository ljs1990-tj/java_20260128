package day15;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventEx1 extends JFrame{
	
	public KeyEventEx1() {
		// TODO Auto-generated constructor stub
		setTitle("키 이벤트!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA");
		label.setBounds(50, 50, 50, 30);
		c.add(label);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					label.setLocation(label.getX() + 10, label.getY());
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					label.setLocation(label.getX() - 10, label.getY());
				} else if(e.getKeyCode() == KeyEvent.VK_UP) {
					label.setLocation(label.getX(), label.getY() - 10);
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					label.setLocation(label.getX(), label.getY() + 10);
				}
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx1();

	}

}
