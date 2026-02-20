package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEvent extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"사과", "배", "체리"};
	private JLabel sumLabel ;
	private int sum = 0;
	public CheckBoxEvent() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange() == ItemEvent.SELECTED) {
						// 체크되었을 때
						if(e.getItem() == fruits[0]) {
							sum += 100;
						} else if(e.getItem() == fruits[1]) {
							sum += 500;
						} else {
							sum += 20000;
						}
					} else {
						// 해제되었을 때
						if(e.getItem() == fruits[0]) {
							sum -= 100;
						} else if(e.getItem() == fruits[1]) {
							sum -= 500;
						} else {
							sum -= 20000;
						}
					}
					sumLabel.setText("현재 " + sum + "원 입니다.");
				}
			});
			c.add(fruits[i]);
		}
		sumLabel = new JLabel("현재 " + sum + "원 입니다.");
		c.add(sumLabel);
		setSize(250, 250);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEvent();
	}

}
