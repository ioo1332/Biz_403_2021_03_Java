package com.callor.apps.service;

import java.util.Scanner;

/* 5명의 학생 국어 영어 수학 점수흘 저장할 배열생성
 * 키보드를 이용하여 입력 배열에 저장
 * 0~100까지 입력가능
 * 범위를 벗어난 점수를 입려갛면 안내메시지보이고 다시 입력
 * 학생별 총점 평균을 계산하고 리스트 출력
 */
public class ScoreServiceV1{

	// 클래스영역에 scanner클래스를 사용하여
	// sscan객체를 선언
	// NullPointException
	// jdk또는 여러가지 클래스를 가져와 사용하는경우
	// 매우자주 만나는 Exception
	// 클래스를 사용하여 객체를 선언만 아직사용할준비가 되어있지않다
	// 사용할 준비가 안되있다==생성초기화가 안되있다
	Scanner scan;
	
	//학생만큼 과목점수를 저장할배열
	int[] num;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	//servic클래스에서 배열의 개수를 고정하지말고
	//최초로 객체를 생성할때 필요한개수를
	//매개변수로전달하고
	//전달받은 매개변수의값을
	//사용하여 배열을 만들자
	public ScoreServiceV1(int members) {
		
	}
/* svV1.makeScore(); 명령을 한줄에 실행하므로서
 * makeScoreServiceV1A(); 클래스에 정의되어있느 어떤코드가 실해오디는 효과를 만들어낸다 
 */
	
	public void makeScore() {
		//무한반복문을 사용하여 국어점수가 0~100범위를 벗어나면
		//메시지를 보여주고 다시 점수를 입력받도록 한다
		//만약 정상적인 범위를 입력하면 반복문을 종료하고 다음코드가 실행되도록한다
		while(true) {
		System.out.println("국어점수를 입력하세요(0~100)");
		System.out.println(">>");
		int score= scan.nextInt();
		if(score<0||score>100) {
			System.out.println("점수는 0~100까지 입력");
		}else {
			break;
			}
		
	}

	}
	// public 전체 공용 모두 누구나
	// 객체 addNum형식으로 메서드를 호출하여 명령을 실행할수있도록 하는 키워드
	public void addNum(){
		this.inputScore();
		// 현재 매서드 코드의 끝이다 라는 선언
		// 매서드 선언 키워드가 보이드이면 
		// 리턴명령을 생략할수있다
		return;
	}	
	// private 개인적인 현재 클래스에서만 메서드를 호출하여
	// 명령을 실행할수있도록하는 키워드
	// 객체.inputScore 형식으로 사용불가
	// 외부에 공개하지않고 현재 클래스의 코드에서만 호출할수 있도록 제한하는 키워드
	// integer 보이드 키워드 대신 정수를 선언하는 
	// 키워드를 사용하여 매서드 선언하기
	// 매서드 코드끝에 반드시 리턴명령문이 있어야하는 매서드
	
	// 여기에서 사용된 인티저 키워드는 변수를선언하는 용도의 키워드가 아니고
	// 리턴 타입 키워드 라고 한다
	// 매서드의 코드내에 리턴값 형식의 코드가 반드시 있어야 함을 선언
	// 리턴타입이 보이드형일 경우는 리턴 명령문이 생략 되거나 리턴명령문만 단독으로 사용할수있다

	// 리턴타입이 보이드 형이 아닐경우 리턴명령문은 반드시 코드내에 적절한위치에 있어야 하고
	// 리턴 값 형식으로 사용해야한다
	private Integer inputScore() {
		return 0;
}
	public String names() {
		return "홍길동";
	}
	public int add() {
		return 0;
	}
}
