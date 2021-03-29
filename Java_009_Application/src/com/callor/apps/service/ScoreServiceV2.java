package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;
	public ScoreServiceV2() {
		scan=new Scanner(System.in);
		
	}
	/* this (현재객체 ,클래스)
	 * 같은클래스내에 있는 코드
	 */
	public void makeScores(){
		System.out.println("국어점수입력");
		/* 매서드 리턴 타입이 보이드가 아닌경우
		 * 매서드가 리턴한값을 변수에 저장할수있다
		 * 이때 변수는 매서드의 리턴타입과 같은 형 이어야 한다
		 */
		Integer intKor=this.inputScore();
		System.out.println("영어점수입력");
		Integer intEng=this.inputScore();
		System.out.println("수학점수입력");
		Integer intMath=this.inputScore();
		
		System.out.println("===============");
		System.out.printf("국어점수:%d\n",intKor);
		System.out.printf("영어점수:%d\n",intEng);
		System.out.printf("수학점수:%d\n",intMath);
		System.out.println("===============");
		
	}
	private Integer inputScore() {
		
	Integer score =0;
		while(true) {
		System.out.println("점수를 입력하세요(0~100)");
		score = scan.nextInt();
		if(score<0||score>100) {
			System.out.println("점수는 0~100까지만");
			continue;
		}
		break;
	}
		//스코어 변수에 저장된값을 호출한곳으로 되돌려주어라
		return score;
		
}
}
