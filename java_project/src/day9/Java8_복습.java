package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java8_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		// 숫자를 입력받아서 6개 저장
		// 숫자의 범위는 1~30 사이. 그 외 값 입력 시 다시 입력하도록
		for(int i=0; i<6; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = s.nextInt();
			if(input < 1 || input > 30) {
				System.out.println("1부터 30사이 입력하셈");
				i--;
				continue;
			} else {
				list.add(input);
			}
		}
		System.out.println(list);	
		
		ArrayList<Integer> oddList = new ArrayList<>();
		for(int i=0; i<6; i++) {
			if(list.get(i) % 2 == 1) {
				oddList.add(list.get(i));
			}
		}
		System.out.println(oddList);
	}

}
