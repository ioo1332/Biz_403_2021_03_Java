package com.collor.classes;

import java.util.Scanner;

public class ScnnerEx_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		String str=scan.nextLine();
		System.out.println("입력한문자열:"+str);
		// 문자열 입력시 동등연산자 X
		// .eqials() 사용
		if(str.equals("END")) {
			System.out.println("안녕");
		}else {
			System.out.println("반가워");
		}
	}
}
