package com.collor.classes;

import java.util.Scanner;

public class ScnnerEx_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 숫자를 입력받는 nextInt()와
		// 문자열을 입력받는 nextLine()를 혼합하여 작성하면
		// 여러가지 문제가 생긴다
		System.out.println("이름>>");
		String strName = scan.nextLine();

		System.out.println("국어>>");
		int intKor = scan.nextInt();
		
		System.out.println("%d의 국어성적");
		
	}
}
