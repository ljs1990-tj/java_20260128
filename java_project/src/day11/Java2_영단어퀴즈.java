package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2_영단어퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		WordQuiz quiz = new WordQuiz();
		ArrayList<Word> quizList = quiz.getList();
//		for(int i=0; i<quizList.size(); i++) {
//			System.out.println(quizList.get(i).getEnglish());
//		}
		Word w =  quizList.get(16);
		System.out.print(w.getEnglish() + " : ");
		String answer = s.next();
		if(w.getKorean().equals(answer)) {
			System.out.println("정답!!");
		} else {
			System.out.println("오답!! 정답은 " + w.getKorean());
		}
		
	}
}
