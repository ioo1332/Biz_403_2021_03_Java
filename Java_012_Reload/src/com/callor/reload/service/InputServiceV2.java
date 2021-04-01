package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;
	// 클래스영역에 선언된 변수는 맴버변수라하고
	// 맴버변수는 이 클래스의 어떤 method에서든지 자유롭게 저장 읽기가 가능하다
	int num;

	public InputServiceV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		// method의 {}에 선언된 변수는 지역 변수라한다
		// 지역변수는 {}을 벗어나면 변수가 소멸된다 또한 {}이 서로 다르면
		// 이름이 같아도 절대 접근이 불가능하다
		// 맴버변수에 같은 이름의 변수가 있는데 지역변수에 같은 이름으로 변수를 선언하면
		// 맴버변수는 감춰져서 접근이 불가하다
		String num;
	}

	public void inPutNum() {
		// 정상적인숫자 입력받을때까지 유효성검사
		while (true) {
			System.out.println("50~150 사이 정수를 입력하세요");
			System.out.println("정수>>");
			int num = scan.nextInt();
			// 50부터 150사이의수
			if (num > 50 && num < 150) {
				// 범위내의 숫자만 입력받고 리스트에 추가
				intList.add(num);
				break;
			} else {
				System.out.println("값은 50부터 150까지 입력하세요");
			}

		}
	}

	public void printNum() {

	}
}
