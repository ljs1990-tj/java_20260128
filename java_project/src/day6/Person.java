package day6;

public class Person {
	private String name ;
	private int age ;
	private String addr;
	private String gender ;
	Person(){
		System.out.println("Person 생성자 호출!");
	}
	Person(String name, int age, String addr){
		this(name, age, addr, "");
	}
	
	Person(String name, int age, String addr, String gender){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}
}
