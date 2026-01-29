package day2;

public class Java21_중첩반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {
			if(i % 2 == 0) {
				System.out.println("===== " + i + "단 =====");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
				System.out.println();
			}
			
		} // 바깥 for
	}
}
