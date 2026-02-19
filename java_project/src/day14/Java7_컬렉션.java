package day14;

import java.util.ArrayList;
import java.util.Random;

public class Java7_컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) {
			int num = ran.nextInt(10)+1;
			if(list.contains(num)) {
				i--;
				continue;
			}
			list.add(num);
		}
		System.out.println(list);
	}

}
