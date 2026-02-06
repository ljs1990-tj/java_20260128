package day8;

public class Java1_업캐스팅 {
	static void test1(Point p) {
		if(p instanceof Point3D) {
			System.out.println("Point3D로 만든 객체!");
		}
		System.out.println(p.getX() * p.getY());
	}
	
//	static void test1(ColorPoint cp) {
//		System.out.println(cp.getX() * cp.getX());
//	}
//	static void test1(Point3D p3) {
//		System.out.println(p3.getX() * p3.getX());
//	}
//	static void test1(PositivePoint pp) {
//		System.out.println(pp.getX() * pp.getX());
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point(1,2);
		ColorPoint colorPoint = new ColorPoint(10, 20, "blue");
		Point3D point3D = new Point3D(1,2,3);
		PositivePoint positivePoint = new PositivePoint(5, 10);
		
		test1(colorPoint);
	}

}
