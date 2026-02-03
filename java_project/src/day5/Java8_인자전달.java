package day5;

import java.util.Arrays;

public class Java8_인자전달 {
	static void objectMethod(int[] arr) {
		arr[0] = 10000;
	}
	public static void main(String[] args) {
		int list[] = {1,2,3,4,5};
		objectMethod(list);
		System.out.println(Arrays.toString(list));
		
	}
}
