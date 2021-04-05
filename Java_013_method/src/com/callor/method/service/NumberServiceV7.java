package com.callor.method.service;

/* 국영수과국 요소를 갖는 문자열 배열 선언
 * 각과목의 점수를 입력받고
 * 점수범위 0~100까지의 유효성검사 수행
 * 
 * 
 */
import java.util.Scanner;

import com.callor.method.InputService;

public class NumberServiceV7 {

	protected Scanner scan;
	protected InputService inputValue;

	public NumberServiceV7() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		inputValue = new InputService();
		String intInput[];
		
	}

	public Integer inputValue(String title) {
		String intInput=null;
		while(true) {
			
		System.out.println("각 과목 점수 입력");
		System.out.println(title+ "점수 입력");
		System.out.println(">>");
		intInput=scan.nextLine();
		
		if (intInput.trim().equals("QUIT")) {
			return null;
		}else {
			
		}
		
	
		
		
		}
	
	}

}
