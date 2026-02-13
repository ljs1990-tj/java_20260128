package day13;

import java.util.Arrays;

public class Java4_2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][5]; // 3행 5열
		int arr2[][] = {
				{5,4,1,2,3},
				{10,5,8,7,1},
				{15,30,40,20,16}
			};
		
//		for(int j=0; j<arr2.length; j++) {
//			for(int i=0; i<arr2[j].length; i++) {
//				System.out.print(arr2[j][i] + " ");
//			}
//			System.out.println();
//		}
		// {5,4,1,2,3}
		for(int array[] : arr2) {
			for(int num : array) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
//		for(int i=0; i<arr2[0].length; i++) {
//			System.out.print(arr2[0][i] + " ");
//		}
//		System.out.println();
//		for(int i=0; i<arr2[1].length; i++) {
//			System.out.print(arr2[1][i] + " ");
//		}
//		System.out.println();
//		for(int i=0; i<arr2[2].length; i++) {
//			System.out.print(arr2[2][i] + " ");
//		}
		
//		System.out.println(arr2[1][2]);
//		System.out.println(Arrays.toString(arr2[0]));
// 		{
//			{0,0,0,0,0},
//			{0,0,0,0,0},
//			{0,0,0,0,0}
//		}
	}

}
