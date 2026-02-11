package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java3_영단어퀴즈v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		WordQuiz quiz = new WordQuiz();
		ArrayList<Word> quizList = quiz.getList();
		ArrayList<Integer> questionList = new ArrayList<Integer>();
		for(int i=0; i<quizList.size(); i++) {
			questionList.add(i);
		}
		
		Random ran = new Random();
		// 랜덤 문제 5개 출제
		// 맞추면 '정답!' , 틀리면 '오답!' 출력
		for(int i=0; i<10; i++) {
			int index = ran.nextInt(questionList.size());
			Word word = quizList.get(questionList.get(index));
			questionList.remove(index);
			
			System.out.print("[ " + (i+1)+ "번 문제 ] " + word.getEnglish()  + " : ");
			String answer = s.next();
			if(answer.equals(word.getKorean())) {
				System.out.println("정답 !");
			} else {
				System.out.println("오답 ! 정답은 " + word.getKorean());
			}
		}
		
	}

}
