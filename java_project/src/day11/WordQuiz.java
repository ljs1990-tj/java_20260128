package day11;

import java.util.ArrayList;

public class WordQuiz {
    private ArrayList<Word> list;

    public WordQuiz() {
        list = new ArrayList<>();

        list.add(new Word("love", "사랑"));
        list.add(new Word("animal", "동물"));
        list.add(new Word("emotion", "감정"));
        list.add(new Word("human", "인간"));
        list.add(new Word("stock", "주식"));
        list.add(new Word("trade", "거래"));
        list.add(new Word("society", "사회"));
        list.add(new Word("baby", "아기"));
        list.add(new Word("honey", "꿀"));
        list.add(new Word("dall", "인형"));
        list.add(new Word("bear", "곰"));
        list.add(new Word("picture", "사진"));
        list.add(new Word("painting", "그림"));
        list.add(new Word("fault", "오류"));
        list.add(new Word("example", "보기"));
        list.add(new Word("eye", "눈"));
        list.add(new Word("statue", "조각상"));
    }
	
	public ArrayList<Word> getList(){
		return list;
	}
}