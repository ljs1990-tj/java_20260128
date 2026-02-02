package day4.classEx;

public class Class실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, 170.5, true);
		System.out.println(hong.name);
		String intro = hong.intro();
		System.out.println(intro);
		
		Human kim = new Human("김철수", 20, 180.5, false);
		Human park = new Human("박영희", 25, 160.5, false);
		
		int a;
		a = 10;
	}
}
