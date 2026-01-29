package day2;

public class Java16_중첩if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 이상의 숫자만 홀수, 짝수 구분
		int num = 150;
		if(num >= 100) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		
	}
}
