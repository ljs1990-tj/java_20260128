package day11;

public class Food {
	private String name;
	private int price;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{name=" + this.name + ", price=" + this.price + "}";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
