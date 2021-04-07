package com.callor.method.service;
/* InputServiceV2 클래스를 이용해
 * 국어 영어 수학 점수를 입력하고 
 * 0~100점 범위내에 입력
 * 총점과 평균 구하기
 */
public class ScoreServiceV3 {
	protected InputServiceV2 inservice;

	public ScoreServiceV3() {
		// TODO Auto-generated constructor stub
		inservice = new InputServiceV2();

	}

	public void inputScore() {

		Integer intKor = inservice.inputValue("국어", 0, 100);
		if(intKor==null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inservice.inputValue("영어", 0, 100);
		if(intEng==null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inservice.inputValue("수학", 0, 100);
		if(intMath==null) {
			System.out.println("종료");
			return;
		}
		int sum = intKor + intEng + intMath;
		float Avg = (float) sum / 3;
		System.out.println("총점:" + sum);
		System.out.println("평균:" + Avg);

	}

}
