package day6;

public class Java4_업캐스팅 {

	static void fruitBoxing(Fruit f) {
		
		if(f instanceof Apple) {
			System.out.println("토마토 서비스로 드림");
		}
		
		// 포장 기능
		System.out.println(f.name + "를 포장한다!");
	}
	
//	static void appleBoxing(Apple a) {
//		// 포장 기능
//		System.out.println(a.name + "를 포장한다!");
//	}
//	static void bananaBoxing(Banana b) {
//		// 포장 기능
//		System.out.println(b.name + "를 포장한다!");
//	}
//	static void orangeBoxing(Orange o) {
//		// 포장 기능
//		System.out.println(o.name + "를 포장한다!");
//	}
	
	public static void main(String[] args) {

		// 부모클래스 -> Fruit
		// 자식클래스 -> Apple, Orange, Banana
		
		Apple apple = new Apple("청주사과", 1000);
//		fruitBoxing(apple);
		Banana banana = new Banana("맛있는 바나나", 500);
		Orange orange = new Orange("그냥 오렌지", 2000);
		
		fruitBoxing(banana);
		fruitBoxing(orange);
		
		int arr[] = new int[5];
		
//		Object arr2[] = {1, "zz", apple, true};
		
//		Fruit a = apple;
//		Fruit b = banana;
//		Fruit o = orange;
	}
}
