package day8;

import java.util.ArrayList;

public class 컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		ArrayList<String> list = new ArrayList<String>();
		list.add("zz");
		list.add("hh");
	
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		
		ArrayList<Object> list3 = new ArrayList<Object>();
		list3.add(1);
		list3.add("z");
		list3.add(list);
		System.out.println(list3);
	}

}
