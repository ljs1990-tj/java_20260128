package day16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame {
	int num = 1;
	Container c;
	Random ran = new Random();
	public Quiz1() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);
		
		createBtn();
		
		setSize(600, 600);
		setVisible(true);
	}
	
	void createBtn() {
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "");
			btn.setLocation(ran.nextInt(500), ran.nextInt(500));
			btn.setSize(50,50);
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton selectBtn = (JButton) e.getSource();
					
//					Integer.parseInt(selectBtn.getText()); // 문자를 숫자로
//					Integer.toString(num); // 숫자를 문자로
					String removeNum = num + "";
					if(selectBtn.getText().equals(removeNum)) {
						c.remove(selectBtn);
						c.repaint();
						num++;
						if(num == 11) {
							createBtn();
							num = 1;
						}
					}
				}
			});
			
			c.add(btn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1();
	}

}
