package day6;

public class Dog extends Animal{
	
	Dog(String name, int age){
		super(name, age);
	}

	@Override
	void speak() {
		System.out.println("멍멍!");
//		super.speak();
	}
	
}
