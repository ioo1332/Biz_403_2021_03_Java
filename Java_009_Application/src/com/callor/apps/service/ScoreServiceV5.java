package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV5 {

	String[] subject;
	/* 3과목의 점수를 저장할 배열을 10개만들었다고 가정을하자
	 * 8번 요소의 배열에 각각 점수를 저장
	 * intKor[8]=90;
	 * intEng[8]=70;
	 * intMath[8]=66;
	 */
	int[] intKor;
	int[] intEng;
	int[] intMath;
	Scanner scan;

	// 생성자 매서드
	public ScoreServiceV5(int members) {

		scan = new Scanner(System.in);
		subject = new String[] { "국어,영어,수학" };
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
/* 현재는 학생 수만큼 모든 과목의 점수 입력을 끝내야만 다른업무로 진행이된다
 * 몇명의 학생 일부과목점수만 입력마치고 잠시 업무를 멈추고싶을때
 * 현재코드는 불가능하다 
 * 업그레이드해서 일부만 입력하고 업무를 중단하는 기능을 넣자 
 */
	public void makeScores() {
		Integer[]scores=new Integer[subject.length];
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d번학생의 성적입력\n",i+1);
			for(int j=0;j<subject.length;j++) {
				scores[j]=this.inputScore(subject[j]);
				/* 입력업무중에 -1을 입력했을때
				 * 입력업무를 중단하고 메인으로 되돌아가고싶다
				 * 이때 브레이크사용하면 포가 겹쳐있기때문에
				 * 원하는대로 코드가 작동되지 않는다 
				 * 이럴경우 리턴타입이 보이드이지만
				 * 리턴명령을 실행하여 메서드코드를 중단할수있다
				 */
				if(scores[j]==-1) {
					return;
				}
			}
			intKor[i] =scores[0];
			intEng[i] =scores[0];		
			intMath[i] =scores[0];
							
			
		}

	}

	private Integer inputScore(String sub) {
		Integer score = 0;
		while (true) {
			System.out.println(sub + "점수를 입력해 주세요(quit:-1)");
			System.out.println(">>");
			score = scan.nextInt();
			// 점수 입력하는중에 -1을 입력하면 입력하는 업무를 중단하자
			if(score==-1) {
				return -1;
			}else if (score < 0 || score > 100) {
				System.out.println(sub + "점수는 0~100까지");
				// continue;
				// continue 명령을 사용하는 대신 else를 사용하여 코드를 작성
			} else {
				break;
			}
		}
		return score;
	}
	/* 프로젝트를 만들고 컴파일을 수행하고 실행했을때
	 * 선언한 클래슨느 코드만 존재한느 상태가 된다
	 * 이 클래스는 객체로 선언하고 생성한후에
	 * 여러가지 method를 호출하여 업무를 수행할수있다.
	 * 
	 * method나 변수에 static을 부착하면 
	 * 사용하지 않아도 method 코드나 변수가 메모리에 상주하게된다.
	 */
	public static String dLine() {
		return "============================";
	}
}
