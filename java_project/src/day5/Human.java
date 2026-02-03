package day5;

public class Human {
	String name;
	int age;
	private String addr;
	int money;
	Human(){}
	Human(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void eat(String food) {
		System.out.println(food + "를 먹는다!");
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
