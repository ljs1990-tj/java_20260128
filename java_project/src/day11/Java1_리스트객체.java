package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java1_리스트객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Food> list = new ArrayList<>();
		ArrayList<String> foodNameList = new ArrayList<>();
		while(true) {
			System.out.print("[1. 제품 등록, 2. 제품 삭제, 3. 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 이름, 가격을 입력받아서 Food 객체로 만든 후 리스트에 저장
				// 단, 중복된 이름 허용 x, 가격은 0이하 x
				
				boolean foodFlg = true;
				String name = "";
				while(foodFlg) {
					System.out.print("제품 이름 : ");
					name = s.next();
					foodFlg = foodNameList.contains(name);
					if(foodFlg) {System.out.println("이미 있는 제품 이름 입니다.");}
				}
				
				int price = 0;
				while(true) {
					System.out.print("제품 가격 : ");
					price = s.nextInt();
					if(price <= 0) {
						System.out.println("1원 이상 입력 하세요.");
					} else {
						break;
					}
				}
				
				Food f = new Food(name, price);
				list.add(f);
				foodNameList.add(name);
				
				System.out.println(list);
			} else if(menu == 2) {
				// 제품 이름을 입력받아서 해당 제품을 삭제
				// 제품 이름이 없으면 '없는 제품 입니다' 출력
				// 있으면 리스트에서 제거
				System.out.print("제품 이름 : ");
				String name = s.next();
				
				boolean foodFlg = foodNameList.contains(name);
				if(foodFlg) {
					for(int i=0; i<list.size(); i++) {
						Food f = list.get(i);
						if(f.getName().equals(name)) {
							list.remove(i);
							foodNameList.remove(i);
							break;
						}
					}
				} else {
					System.out.println("없는 제품 입니다");
				}
			} else if(menu == 3) {
				
			} else {
				
			}
		}
		
	}

}
