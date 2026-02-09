package day9;

import java.util.ArrayList;

public class Java1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(9);
//		list.add("haha");
		System.out.println(list);
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add(30);
		list2.add(true);
		
		list2.remove(1);
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
