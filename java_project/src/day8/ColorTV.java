package day8;

public class ColorTV extends TV{
	int color;
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	
	void printProperty(){
		// 32인치 1024컬러
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}
