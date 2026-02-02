package day4.classEx;

public class Class실습1 {
	public static void main(String[] args) {
		// hong 객체
		Human hong = new Human();
		hong.name = "홍길동";
		System.out.println(hong.name);
		hong.age = 30;
		System.out.println(hong.age);
		hong.eat();
		String txt = hong.intro();
		System.out.println(txt);
		
		// kim 객체
		Human kim = new Human();
		kim.name = "김철수";
		System.out.println(kim.name);
		kim.speak();
		
	}
}
