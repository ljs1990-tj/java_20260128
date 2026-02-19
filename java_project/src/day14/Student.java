package day14;

public class Student extends Person{
	private int stuNo;
	
	Student(String name, String addr, int stuNo){
		super(name, addr);
		this.stuNo = stuNo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 학번 : " + this.stuNo;
	}
}
