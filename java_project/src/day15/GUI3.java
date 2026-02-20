package day15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI3 extends JFrame{
	public GUI3() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4, 5,5));
		
		String str[] = {
				"7","8","9","*",
				"4","5","6","-",
				"1","2","3","+",
				"/","0",".","="
			};
		
		for(int i=0; i<str.length; i++) {
			c.add(new JButton(str[i]));
		}
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI3();
	}

}
