package day8;

public class PositivePoint extends Point{
	public PositivePoint() {
		super(0, 0);
	}
	PositivePoint(int x, int y){
		super(x, y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ")의 점";
	}
}
