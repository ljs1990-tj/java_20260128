package day4.classEx;

public class Circle {
	int radius;
	String name;

	// 생성자는 생략 가능
	Circle(){}
	Circle(String name, int radius){
		this.name = name;
		this.radius = radius;
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
}
