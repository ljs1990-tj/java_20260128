package day14;

public class GoodCalc extends Calculator1{

	@Override
	int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	int max(int x, int y) {
		// TODO Auto-generated method stub
		return x > y ? x : y;
	}

}
