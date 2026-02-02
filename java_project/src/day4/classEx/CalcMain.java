package day4.classEx;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.intro();
		
		int a = calc.abs(-10);
		int b = calc.sum(5, 10);
		int c = calc.abs(99);
		
		calc.sum(5, 10.8);
		
	}
}
