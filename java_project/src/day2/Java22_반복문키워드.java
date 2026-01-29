package day2;

public class Java22_반복문키워드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break는 반복문을 빠져 나간다.
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				break;
//			}
//		}
		
		// continue는 곧바로 반복문의 증감식으로 이동
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
