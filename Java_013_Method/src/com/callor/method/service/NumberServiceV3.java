package com.callor.method.service;

import java.util.Scanner;

/* 입력오류에대한 예외처리 
 * 정수값의 유효성 검사를 수행합니다
 */
public class NumberServiceV3 {

	/*
	 * 정수를 키보드에서 입력받아 정수를 return 하거나 : int 
	 * QUIT를 입력하면 null을 return: AND ==> Integer
	 * void 대신 Integer
	 */

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0 ~ 100까지 정수입력");
			System.out.println("QUIT 입력중단");
			System.out.println(">> ");
			String strInput = scan.nextLine();
			
			if(strInput.trim().equals("QUIT")) {
				return null;
			} else {
				
				// 1. 입력된값이 QUIT가 아니면 일단
				// 		정수로 바꿔보자
				try {
					Integer intNum = Integer.valueOf(strInput);
					
					// 2. 정수이면 0 ~ 100까지 인지 알아보자
					if(intNum < 0 || intNum > 100) {
						System.out.println("범위를 벗어났음");
						System.out.println("0 ~ 100까지 만 입력");
						// 다시 입력하는 곳으로 가라
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("값은 숫자만 입력하세요");
					// 다시 입력하는 곳으로 가라!!
					continue;
				}
			}
		}
//		return null;
	}

}