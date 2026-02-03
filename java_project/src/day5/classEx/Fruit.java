package day5.classEx;

public class Fruit {
	private String name;
	private int price;
	private int count;
	
	Fruit(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public void setPrice(int price) {
		if(price < 100) {
			System.out.println("가격을 다시 확인해주세요.");
		} else {
			this.price = price;
		}
	}
	public int getPrice() {
		return this.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
