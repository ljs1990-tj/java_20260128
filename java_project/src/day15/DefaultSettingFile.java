package day15;

import java.awt.Container;

import javax.swing.JFrame;

public class DefaultSettingFile extends JFrame {
	public DefaultSettingFile() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DefaultSettingFile();
	}

}
