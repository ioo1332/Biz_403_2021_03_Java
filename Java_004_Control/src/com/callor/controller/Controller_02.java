package com.callor.controller;

public class Controller_02 {

	public static void main(String[] args) {

		/*
		 * boolean true,false 2가지경우의 값을 갖는 특별한 형태 대입연산자(=)오른쪽의 연산을 수행하여
		 * 3==3(=:동등연산자,일치연산자) 결과를 bYes변수에 담아라 동등연산자: 두값이 같냐? 결과는 true false가 나타난다
		 */

		boolean bYes = 3 == 3;

		bYes = 15 % 3 == 0;
		int intNum = 15;
		// intNum에 담긴 값이 3의 배수이냐
		System.out.println(intNum % 3 == 0);
		// intNum에 담긴 값이 5의 배수이냐
		System.out.println(intNum % 5 == 0);

		// intNum에 담긴값이 3의배수이면서 5의배수이냐
		// %3==0 and %5==0이냐

		bYes = intNum % 3 == 0 && intNum % 5 == 0;

		intNum = 12;
		// intNum에 담긴값이 3의배수이거나 또는 5의배수이냐
		//

		bYes = intNum == 0 || intNum % 5 == 0;
		/*
		 * 관계연산자 2가지이상의 비교연산을 동시수행하기위한 연산
		 */

		// && 는 true : 1, false 0으로 하는 곱셈
		// 연산을 기억하면 된다.
		bYes = true && true; // 1 * 1 = 1 : true
		bYes = true && false; // 1 * 0 = 0 :false
		bYes = false && true; // 0 * 1 = 0 : false
		bYes = false && false; // 0 * 0 = 0 : false

		// ||(filter 기호) 는 true : 1, false 0으로하여
		// 덧셈을 연상한다
		bYes = true || true;// 1 + 1 = 1(있다) : true
		bYes = true || false; // 1 + 0 = 1 : true
		bYes = false || true; // 0 + 1 = 1 : true
		bYes = false || false; // 0 + 0 = 0 : false

	}

}