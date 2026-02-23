package day16;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame {
	Random ran = new Random();
	ArrayList<Integer> list = new ArrayList<>();
	int num = 1;
	Container c;
	long startTime ;
	public Quiz2() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new GridLayout(5, 5, 5, 5));
		
		createBtn();
		
		setSize(600, 600);
		setVisible(true);
	}
	
	void createBtn() {
		for(int i=1; i<=25; i++) {
			int ranNum = ran.nextInt(25) + 1;
			if(list.contains(ranNum)) {
				i--;
				continue;
			}
			list.add(ranNum);
			JButton btn = new JButton(ranNum + "");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton removeBtn = (JButton) e.getSource();
					if(removeBtn.getText().equals(num + "")) {
						if(num == 1) {
							startTime = System.currentTimeMillis();
						}
						c.remove(removeBtn);
						c.repaint();
						num++;
						if(num == 26) {
							long lastTime = System.currentTimeMillis();
							System.out.println((lastTime - startTime) / 1000.0 );
							num = 1;
							list.clear();
							createBtn();
							c.revalidate();
							c.repaint();
						}
					}
				}
			});
			c.add(btn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz2();
	}

}
