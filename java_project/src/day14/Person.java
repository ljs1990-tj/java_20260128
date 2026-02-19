package day14;

public class Person {
	private String name;
	private String addr;
	
	Person(){
		this("알수없음");
	}
	Person(String name){
		this(name, "알수없음");
	}
	Person(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.name + ", 주소 : " + this.addr;
	}
	
	
	
	
	
	
	
	
}
