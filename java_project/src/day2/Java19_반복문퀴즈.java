package day2;

public class Java19_반복문퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for + if 퀴즈
		// 1. 1부터 100까지 숫자 중 3의 배수만 출력
//		for(int i=1; i<=100; i++){
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		
		// 2. 10부터 1까지(역순으로) 숫자 출력
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
		// 3. 1부터 100까지 숫자 중 
		// 홀수들의 합과 짝수들이 합
		int oddSum = 0; // 홀수 합
		int evenSum = 0; // 짝수 합
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) { // 홀수
				oddSum += i; // oddSum = oddSum + i;
			} else { // 짝수
				evenSum += i;
			}
		}
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
	}
}
