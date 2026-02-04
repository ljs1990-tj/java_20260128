package day6;

public class Employee extends Person{
	String empNo;
	
	public Employee(String name, int age, String addr, String empNo) {
		super(name, age, addr);
		this.empNo = empNo;
	}
	public Employee(String name, int age, String addr, String gender, String empNo) {
		super(name, age, addr, gender);
		this.empNo = empNo;
	}
}
