package day3;

public class Java3_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단을 역순을 출력
		
		for(int i=9; i>=2; i--) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
	}
}
