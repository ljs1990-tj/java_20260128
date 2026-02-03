package day5.classEx;

public class Student {
	// 변수(필드) + 메소드
	String name;
	int age;
	private String stuNo;
	int money; // 개인의 돈
	static int money_708 = 200000; // 708호 회비
	
	// 3개의 변수를 초기화 하는 생성자 작성
	Student(String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}
	
	void study() {
		System.out.println(this.name + "가(이) 공부를 한다.");
	}
	void study(String subject) {
		System.out.println(subject + "를 공부한다.");
	}
	
	public String getStuNo() {
		return this.stuNo;
	}
}
