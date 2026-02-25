package day17;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 수도퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		CapitalQuiz obj = new CapitalQuiz();
		ArrayList<Quiz> quizList = obj.getList();
		ArrayList<String> questionList = new ArrayList<>();
		
		ArrayList<Integer> selectList = new ArrayList<>(); // 보기 인덱스 관리 리스트
		
		Random ran = new Random();
		
		int count = 0;
		while(true) {
			System.out.print("몇문제 풀래? : ");
			count = s.nextInt();
			if(count > quizList.size() || count < 3) {
				System.out.println("최대 문제 수는 " + quizList.size() + ", 최소 문제 수는 3문제 입니다.");
				continue;
			} 
			break;
		}
		for(int i=1; i<=count; i++) {
			selectList.clear();
			int ranNum = ran.nextInt(quizList.size());
			Quiz quiz = quizList.get(ranNum);
			if(questionList.contains(quiz.getCountry())) {
				i--;
				continue;
			}
			int correctIndex = ran.nextInt(4); // 리스트에서 정답의 위치 랜덤하게 0~3
			for(int j=0; j<4; j++) {
				int index = ran.nextInt(quizList.size());
				if(correctIndex == j) { // 정답 위치와 j가 같을 때 보기에 추가
					selectList.add(ranNum);
				} else if(selectList.contains(index) || index == ranNum) { // 이미 보기에 있거나 정답과 같을 경우 다시 시도
					j--;
				} else { // 정답 외 값들 보기에 추가
					selectList.add(j, index);
				}
			}
			
			System.out.println(i + ") " + quiz.getCountry() + " 수도? ");
			for(int j=0; j<4; j++) { // 리스트에 있는 index 기준으로 보기 작성
				System.out.print("["+(j+1)+"] "+quizList.get(selectList.get(j)).getCapital() + " ");
			}
			System.out.print(": ");
			int answer = s.nextInt();
			if(quizList.get(selectList.get(answer-1)).getCapital().equals(quiz.getCapital())) {
				System.out.println("정답!");
			} else {
				System.out.println("오답!"); 
			}
			questionList.add(quiz.getCountry());
		}
		
	}

}
