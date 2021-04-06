package com.callor.method;

import java.util.Scanner;

public class Method_04 {
			
		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			/* 입력을 받는데 정수 0~100 또는 문자열 QUIt 
			 * 다른 타입의 데이터를 동시에 취급하기위해서는 
			 * 기본 타입을 String형으로 설정 하는것이 편하다
			 */
			System.out.println("0~100 까지 정수 입력");
			System.out.println("QUIT 입력시 종료");
			System.out.println(">>");
			String strNum=scan.nextLine(); // 모든 입력을 문자열 타입으로 받겠다
			 if(strNum.equals("QUIT")) {
				 System.out.println("종료합니다");
			 }else {
				 
				 // QUIT 가 아닌 다른값을 입력 받으면 
				 // 일단 입력된 값을 정수형 으로 변환 해보자
				 // 변환된 정수값을 변수에 저장
				int intNum1=Integer.valueOf(strNum); 
				Integer intNum2=Integer.valueOf(strNum);
				
				System.out.println("입력된 정수"+intNum2);
			 }
			
			
			
			
			 
		}

	}

	


