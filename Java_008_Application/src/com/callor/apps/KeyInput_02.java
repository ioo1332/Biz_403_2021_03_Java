package com.callor.apps;

import java.util.Scanner;

public class KeyInput_02 {
	
	public static void main(String[] args) {
		
		// 키보드에서 데이터를 입력 받기위한 준비
		Scanner scan = new Scanner(System.in);
	
		/* Prompt 프롬프트
		 * 키보드 입력을 대기하는 명령이 실행되기 전에는
		 * 반드시 무엇을 해야하는지에 대한 안내 메세지를
		 * 먼저 출력해야한다
		 */
		System.out.println("정수값을"+ " 키보드로 입력하고 Enter"+"를 눌러주세요");
		System.out.println("먼저 정수 1개를 입력하세요");
		System.out.print("정수1>>");
		int num1=scan.nextInt();
		System.out.println("한번 더 정수 1개를 입력하세요");
		System.out.print("정수2>>");
		int num2=scan.nextInt();
		
		System.out.print("입력된 두 정수의합:");
		System.out.println(num1+num2);
		
	}

}
