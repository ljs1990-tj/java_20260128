package day14;

public class GoodCalc2 implements Calculator2{

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int max(int x, int y) {
		// TODO Auto-generated method stub
		return x > y ? x : y;
	}


}
