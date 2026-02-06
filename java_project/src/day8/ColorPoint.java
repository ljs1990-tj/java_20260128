package day8;

public class ColorPoint extends Point{
	private String color;
	ColorPoint(){
//		super(0,0);
//		this.color = "BLACK";
		this(0, 0, "BLACK");
	}
	ColorPoint(int x, int y){
		this(x, y, "BLACK");
	}
	ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		super.move(x,y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// RED색의 (10,20)의 점
		return this.color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}
