package day2;

public class Java17_조건문switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch ~ case는 else if가 많은 코드를 작성할 때
		// 유용하다.
		int score = 100;
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
