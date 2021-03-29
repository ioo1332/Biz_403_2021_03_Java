package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {
		int linelength=20;
		System.out.println(LinesService.dLines(linelength));
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력하고 Enter 눌러주세요");
		System.out.println(LinesService.sLines(linelength));
		System.out.println("첫번째 정수 입력");
		System.out.print("정수1>> ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 입력");
		System.out.print("정수2>> ");
		int num2 = scan.nextInt();
		System.out.println(LinesService.dLines(linelength));
		System.out.println("두 정수의 사칙연산 결과");
		System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
		System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
		System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
		System.out.printf("%d/%d=%f\n", num1, num2, (float)num1 / num2);
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		System.out.println(LinesService.dLines(linelength));
		
	}
}
