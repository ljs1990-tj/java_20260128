package day7;

import day6.classEx.ArrayFunc;

public class Calculator {
	static final double PI = 3.14;
	
	private String name;
	int price;
	String color;
	
	Calculator(String name, int price, String color){
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	int sum(int[] arr) {
		ArrayFunc func = new ArrayFunc();
		return func.arrSum(arr);
	}

	public String getName() {
		return name;
	}
	
}
