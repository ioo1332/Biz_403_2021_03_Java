package com.callor.controller;

import java.util.Random;

/* jdk에는 수없이 많은 도구들이 포함되어있다
 * lego블럭을 이용해서 작품을 만드는 것처럼 jdk에 있는 도구들을 사용하여 프로젝트를 만들수있다
 * jdk에 있는 도구는 워낙 종류 개수가 많아서 한꺼번에 프로젝트에 포함하면 프로젝트가 너무 거대해질것이다
 * 이러한 문제를 방지하기 위해 java에서는 가장 기본적인 도구외에는 모두 파일로 제공하고 
 * 필요에따라 import하여 사용할수있도록 하고있다
 * import java.util.Random;
 * 지금부터  controller_06클래스에서 java.util 패키지의 random 클래스라는 도구를 사용하여 코딩을 하겠다라는 선언
 * 이클립스에서 도구를 사용하기위해서 import하기 위해서 Ctrl+Shift+o 를 눌러주면 된다
 * Ctrl+shift+f 코드의 모양을 정렬하기
 */

public class Controller_06 {

	public static void main(String[] args) {

		/*
		 * 프로젝트에서 jdk의 (클래스)도구를 사용하는 방법 변수를 선언하고 초기화하는것과 유사
		 * 
		 * int키워드는 정수형변수를 선언하는 키워드 Integer 정수형변수를 선언하는 키워드 실체는 키워드가 아니고 class 이다
		 * 
		 * 키워드는 java가 처음 탄생될때부터 만들어진 명령어 class는 키워드처럼 사용이 되지만 java가 탄생하고 이후에 필요에따라 추가,
		 * 확장된 명령
		 */

		Random rnd = null; // 선언
		rnd = new Random(); // 초기화

		Random rnd1 = new Random();

		int num1 = 0;
		Integer num2 = 0;
		Integer num3 = new Integer(0); // 초기화

		String str1 = "";
		str1 = "홍길동";
		String str2 = null;
		str2 = "이몽룡";
		String str3 = new String(); // 초기화

		/*
		 * wrapper클래스 = 클래스이지만 변수선언처럼 사용할수있는 도구들
		 * Integer Long Float Double Boolean Charactor들은 int long float double boolean char 키워드에 확장된 기능을 할수있도록 만들어진 class이다
		 * 기본기능은 값을 저장하는 변수를 선언한다 
		 * 기본기능에 별도로 확장된 추가명령을 수행할수있도록 만들어진 도구
		 */

	}
}
