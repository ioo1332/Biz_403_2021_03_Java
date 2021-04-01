package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 어디선가 (main()method)에서 객체로 선언 생성한후 
 * method호출을 통해 명령을 실행하는 클래스
 */
public class InputServiceV1 {
	// 맴버변수들 : 클래스영역에 선언된 객체들
	// 접근제한자
	// private: 나혼자 단독으로 사용할때
	// protected: 이 클래스를 누군가 상속하여 사용할수있도록 하기위해
	// 정수형 데이터들을 담을 리스트형 객체
	// Integer wrapper 클래스형 데이터들을 담을 리스트
	protected List<Integer> intList;
	// 키보드 입력을 받아 코드를 수행하기위해 선언
	protected Scanner scan;
	// 선언만된 객체는 코드를 호출하여 기능을 수행할수없다
	// 반드시 생성(초기화)를 해주어야한다
	// 현재 service 클래스의 생성자 method에서 수행을한다

	// ctrl space로 바로 생성가능
	public InputServiceV1() {
		// TODO InputServiceV1의 생성자 method
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	// method 선언문
	// 클래스에 선언하는 기본 타입의 method
	// {}: 블레이드, 코드블럭
	// 코드블럭 안에 연산을 수행하는 코드를 작성하고 그 코드들의 묶음을 inputNum이라고 선언하겠다
	public void inputNum() {
		// 키보드로 정수값을 입력받는
		System.out.println("키보드로 정수를 입력하세요");
		System.out.println("정수>>");
		Integer num = scan.nextInt();

		// 키보드로 입력받은 정수를 intList에 추가
		intList.add(num);
	}

	public void printNum() {
		for (int i = 0; i < intList.size(); i++) {
			Integer num = intList.get(i);
			System.out.println("정수:" + num);
		}

	}

}