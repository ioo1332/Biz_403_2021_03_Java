package com.callor.controller;

import java.util.Random;

public class Controller_07 {

	public static void main(String[] args) {

		// Random rnd : 선언부 ,random 클래스를 사용하여 어떤 명령어를 수행하기 위한 예약
		// =new Random():초기화, 생성부 Random클래스를 사용하여 선언된 rnd 변수를 사용하기위한 생성
		Random rnd = new Random();

		// Random 클래스에서 제공하는 nextInt()명령을 수행하라
		// 그리고 명령을 수행한결과를 num변수에 저장하라
		// 어떤 임의 정수를 만들어서 num변수에 저장해달라
		int num = rnd.nextInt();

		// 대입연산자(=)오른쪽에는 값,연산식,변수가 올수있다
		// 왼쪽에는 변수에값,연산식의결과 변수에 담긴값을 저장한다
		int num1 = 3;
		num1 = 3 + 3;
		num1 = num;
		// -2의 31부터 2의 31승 -1까지 범위에 포함되는 임의의 난수를 만들어 num변수에 저장
		// 난수 : 예측할수없는 무작위의 숫자들
		num = rnd.nextInt();
		System.out.println(num);
	}
}
