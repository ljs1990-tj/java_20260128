package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java4_영단어퀴즈 {

	public static void runQuiz(ArrayList<Word> quizList, ArrayList<String> questionList) {
		Scanner s = new Scanner(System.in);
		
		Random ran = new Random();
		// 랜덤 문제 5개 출제
		// 맞추면 '정답!' , 틀리면 '오답!' 출력
		for(int i=0; i<5; i++) {
			
			if(quizList.size() == questionList.size()) {
				System.out.println("남은 문항이 존재하지 않습니다");
				break;
			}
			
			int index = ran.nextInt(quizList.size());
			Word word = quizList.get(index);
			
			boolean quizFlg = questionList.contains(word.getEnglish());
			if(quizFlg) {
				i--;
				continue;
			}
			
			System.out.print("[ " + (i+1)+ "번 문제 ] " + word.getEnglish()  + " : ");
			String answer = s.next();
			if(answer.equals(word.getKorean())) {
				System.out.println("정답 !");
			} else {
				System.out.println("오답 ! 정답은 " + word.getKorean());
			}
			questionList.add(word.getEnglish());
		}
	}
	
	public static void addQuiz(WordQuiz quiz) {
		Scanner s = new Scanner(System.in);
		System.out.print("영어 : ");
		String english = s.next();
		System.out.print("한국어 : ");
		String korean = s.next();
		
		quiz.setWord(english, korean);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		WordQuiz quiz = new WordQuiz();
		ArrayList<Word> quizList = quiz.getList();
		ArrayList<String> questionList = new ArrayList<String>();
		while(true) {
			System.out.print("[1. 문제 풀이, 2. 문제 추가, 3. 문제 수 확인 ] : ");
			int menu = s.nextInt();
			switch (menu) {
				case 1:
					runQuiz(quizList, questionList);
					break;
				case 2:
					addQuiz(quiz);
					break;
				case 3:
					System.out.println("현재 등록된 문제 수는 " + quizList.size() + "개 입니다." );
					break;
				default:
					break;
			}
			
		}
		
	}

}
