package day5;

public class Student extends Human{
	String stuNo;
	
	Student(String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}
	
	void study() {
		System.out.println(this.name + "가 공부를 합니다.");
	}
}
