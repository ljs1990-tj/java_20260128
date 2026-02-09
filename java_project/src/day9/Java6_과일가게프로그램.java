package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java6_과일가게프로그램 {
	static Scanner s = new Scanner(System.in);
	public static int inputNumber(int first, int last) {
		int result = 0;
		while(true) {
			result = s.nextInt();
			if(result < first || result > last) {
				System.out.print(first + "~" + last + "사이 값을 다시 입력해주세요 : ");
			} else {
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [1. 과일 등록, 2. 과일 판매, 3. 가격 수정, 4. 종료]
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while(true) {
			System.out.print("[1. 과일 등록, 2. 과일 판매, 3. 가격 수정, 4. 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 1. 과일 등록
				// 과일이름(name), 개수(count), 가격(price)을 입력받아서
				// map에 저장 후 리스트에 추가
				// 개수는 1~200사이, price는 100~10000사이 값 
				
				// + 동일한 이름의 과일이 있을 경우
				// 가격은 물어보지 않고, 개수만 입력 받아서 기존 개수에 더하기
				HashMap<String, Object> fruit = new HashMap<>();
				Boolean fruitFlg = false;
				System.out.print("과일 이름 : ");
				String name = s.next();
				// [{name=사과, price=1000, count=10}, {name=오렌지, price=1500, count=5}]
				// 첫번째 map 주소 => abcd, 두번째 map 주소 => asdf
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if(map.get("name").equals(name)) {
						fruitFlg = true;
						System.out.print("개수 : ");
						int count = inputNumber(1, 200);
						map.put("count", (int) map.get("count") +  count);
						break;
					}
				}
				
				if(!fruitFlg) {
					fruit.put("name", name);
					
					System.out.print("개수 : ");
					int count = inputNumber(1, 200);
					fruit.put("count", count);
					
					System.out.print("가격 : ");
					int price = inputNumber(100, 10000);
					fruit.put("price", price);
					
					list.add(fruit);
				}
				
			} else if(menu == 2) {
				System.out.println(list);
			} else if(menu == 3) {
				
			} else if(menu == 4){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4 사이 메뉴 선택 하셈.");
			}
		}
		
	}

}
