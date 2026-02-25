package day17;

import java.util.ArrayList;

public class CapitalQuiz {
    private ArrayList<Quiz> list;

    public CapitalQuiz() {
        list = new ArrayList<>();

        list.add(new Quiz("대한민국", "서울"));
        list.add(new Quiz("미국", "워싱턴DC"));
        list.add(new Quiz("일본", "도쿄"));
        list.add(new Quiz("중국", "베이징"));
        list.add(new Quiz("영국", "런던"));
        list.add(new Quiz("프랑스", "파리"));
        list.add(new Quiz("독일", "베를린"));
        list.add(new Quiz("이탈리아", "로마"));
        list.add(new Quiz("캐나다", "오타와"));
        list.add(new Quiz("호주", "캔버라"));
        list.add(new Quiz("브라질", "브라질리아"));
        list.add(new Quiz("러시아", "모스크바"));
        list.add(new Quiz("스페인", "마드리드"));
        list.add(new Quiz("인도", "뉴델리"));
        list.add(new Quiz("멕시코", "멕시코시티"));
        list.add(new Quiz("아르헨티나", "부에노스아이레스"));
        list.add(new Quiz("이집트", "카이로"));
        list.add(new Quiz("터키", "앙카라"));
        list.add(new Quiz("태국", "방콕"));
        list.add(new Quiz("베트남", "하노이"));
        list.add(new Quiz("인도네시아", "자카르타"));
        list.add(new Quiz("사우디아라비아", "리야드"));
        list.add(new Quiz("남아프리카공화국", "프리토리아"));
        list.add(new Quiz("스위스", "베른"));
        list.add(new Quiz("네덜란드", "암스테르담"));
        list.add(new Quiz("벨기에", "브뤼셀"));
        list.add(new Quiz("스웨덴", "스톡홀름"));
        list.add(new Quiz("노르웨이", "오슬로"));
        list.add(new Quiz("그리스", "아테네"));
        list.add(new Quiz("폴란드", "바르샤바"));
        list.add(new Quiz("필리핀", "마닐라"));
    }

    public ArrayList<Quiz> getList() {
        return list;
    }

    public void setCapital(String country, String capital) {
        list.add(new Quiz(country, capital));
    }
}