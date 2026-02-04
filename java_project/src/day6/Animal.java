package day6;

public class Animal {
	String name ;
	int age ;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void speak() {
		System.out.println("소리낸다");
	}
}
