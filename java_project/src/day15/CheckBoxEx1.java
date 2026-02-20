package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame {
	public CheckBoxEx1() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox box1 = new JCheckBox("자바", true);
		JCheckBox box2 = new JCheckBox("오라클");
		
		ImageIcon img1 = new ImageIcon("images/RYAN_1.jpg");
		Image image = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(image);
		
		ImageIcon img2 = new ImageIcon("images/RYAN_2.jpg");
		image = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(image);
		
		JCheckBox box3 = new JCheckBox(img1);
		box3.setBorderPainted(true);
		box3.setSelectedIcon(img2);
		
		
		c.add(box1);
		c.add(box2);
		c.add(box3);
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx1();
	}

}
