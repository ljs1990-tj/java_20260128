package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Java5_성적관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		ArrayList<String> stuNoList = new ArrayList<String>();
		
		// 1번메뉴 -> 학생 추가, 2번메뉴 -> 성적입력, 3번메뉴 -> 성적조회
		// 4번메뉴 -> 종료, 그외 숫자 -> 다시 입력하도록
		while(true) {
			try {
				System.out.print("[1. 학생추가, 2. 성적입력, 3. 성적조회, 4. 종료] : ");
				int menu = s.nextInt();
				if(menu == 1) {
					Boolean stuNoFlg = true;
					String stuNo = "";
					while(stuNoFlg) {
						System.out.print("학번 : ");
						stuNo = s.next();
						stuNoFlg = stuNoList.contains(stuNo);
						if(stuNoFlg) {System.out.println("중복된 학번 있음!");}
					}
					
					
					System.out.print("이름 : ");
					String name = s.next();
					System.out.print("나이 : ");
					int age = s.nextInt();
					
					Student stu = new Student(stuNo, name, age);
					stuNoList.add(stuNo);
					list.add(stu);
					System.out.println(list);
					System.out.println(stuNoList);
				} else if(menu == 2) {
					// 학번을 입력받아서 해당 학번 학생의 자바, 오라클, html
					// 입력 받아서 저장
					// 해당하는 학번 없을 경우 '해당 학번을 가진 학생이 없습니다' 출력 후
					// 메뉴로 이동
					Boolean stuFlg = false;
					System.out.print("학번 : ");
					String stuNo = s.next();
					for(int i=0; i<list.size(); i++) {
						Student stu = list.get(i);
						if(stuNo.equals(stu.getStuNo())) {
							stuFlg = true;
							stu.setJava();
							
							System.out.print("오라클 : ");
							int oracle = s.nextInt();
							stu.setOracle(oracle);
							
							System.out.print("html : ");
							int html = s.nextInt();
							stu.setHtml(html);
						}
					}
					if(!stuFlg) {
						System.out.println("해당 학번을 가진 학생이 없습니다");
					}
					System.out.println(list);
				} else if(menu == 3) {
					// 모든 학생의 정보 출력
					// 학번 : ooo, 이름 : ooo, 자바 : oo, 오라클 oo, html oo
					for(int i=0; i<list.size(); i++) {
						Student stu = list.get(i);
						System.out.print("학번 : " + stu.getStuNo() + ", ");
						System.out.print("이름 : " + stu.getName() + ", ");
						System.out.print("자바 : " + stu.getJava() + ", ");
						System.out.print("오라클 : " + stu.getOracle() + ", ");
						System.out.print("html : " + stu.getHtml());
						System.out.println();
					}
				} else if(menu == 4) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("1~4중에 선택하셈");
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("에러 발생! 다시 시도 해주셈!");
				s.next();
			}
		}
		
	}

}
