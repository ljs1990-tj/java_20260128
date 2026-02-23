package day16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBtnEvent extends JFrame {
	JRadioButton radio[] = new JRadioButton[3];
	String text[] = {"사과", "배", "체리"};
	ImageIcon image[] = {
			new ImageIcon("image/RYAN_1.jpg"),
			new ImageIcon("image/RYAN_2.jpg"),
			new ImageIcon("image/RYAN_3.jpg")
	};
	JLabel imageLabel = new JLabel();
	
	public RadioBtnEvent() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<image.length; i++) {
			Image img = image[i].getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			image[i] = new ImageIcon(img);
		}
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(radio[0].isSelected()) {
						imageLabel.setIcon(image[0]);
					} else if(radio[1].isSelected()) {
						imageLabel.setIcon(image[1]);
					} else {
						imageLabel.setIcon(image[2]);
					}
				}
			});
		}
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioBtnEvent();
	}

}
