package com.callor.method.service;

/* subject{"국어","영어","수학"} 배열 선언
 * 과목의 점수를 담을 3개의 리스트 선언
 * InputServiceV2 inputValue()method를 사용해 5명의 학생 과목점수 입력
 * 입력받은 점수를 kors engs maths 리스트에 add()
 * printScore() 사용하여 성적리스트 출력 
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected InputServiceV2 inservice;

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	List<Integer> korList;
	List<Integer> engList;
	List<Integer> mathList;

	public ScoreServiceV5() {
		// TODO Auto-generated constructor stub
		inservice = new InputServiceV2();
		korList = new ArrayList<Integer>();
		engList = new ArrayList<Integer>();
		mathList = new ArrayList<Integer>();
		subject = new String[] { "국어", "영어", "수학" };
	}

	public void inputScore() {

		for (int i = 0; i < 5; i++) {
			Integer score = inservice.inputValue(subject[i], 0, 100);
			if (score == null) {
				return;
			} else {
				if (i == 0) {
					korList.add(score);
				} else if (i == 1) {

				}
			}
		}
	}

	public void inputScore2() {

		for (int i = 0; i < 5; i++) {
			Integer score = inservice.inputValue(subject[i], 0, 100);
			if (score == null) {
				System.out.println("종료");
				return;
			} else if (subject[i].equals("국어")) {
				korList.add(score);
			} else if (subject[i].equals("수학")) {
				mathList.add(score);
			} else if (subject[i].equals("영어")) {
				engList.add(score);
			}

		}

	}

	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(50));
		for (int index = 0; index < korList.size(); index++) {
			System.out.println(korList.get(index) + "\t");
			System.out.println(engList.get(index) + "\t");
			System.out.println(mathList.get(index) + "\t");

		}

	}

	public void inputScore3() {
		for (int st = 0; st < 5; st++) {
			Integer[] scores = new Integer[subject.length];
			for (int sb = 0; sb < subject.length; sb++)
				scores[sb] = inservice.inputValue(subject[sb]);
			// scores 에는 한 학생의 국어 영어 수학 점수가 저장되어있다
			korList.add(scores[0]);
			engList.add(scores[0]);
			mathList.add(scores[0]);
		}

	}

}
