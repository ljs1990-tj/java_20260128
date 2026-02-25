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
			
			int ranNum = ran.nextInt(quizList.size());
			Quiz quiz = quizList.get(ranNum);
			if(questionList.contains(quiz.getCountry())) {
				i--;
				continue;
			}
			
			System.out.print(i + ") " + quiz.getCountry() + " : ");
			String answer = s.next();
			if(answer.equals(quiz.getCapital())) {
				System.out.println("정답!");
			} else {
				System.out.println("오답!"); 
			}
			questionList.add(quiz.getCountry());
		}
		
	}

}
