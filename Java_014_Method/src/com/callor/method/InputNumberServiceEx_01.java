package com.callor.method;

import com.callor.method.service.InputNumberServiceV1;

public class InputNumberServiceEx_01 {
	

	public static void main(String[] args) {
		
		InputNumberServiceV1 inV1=new InputNumberServiceV1();
		
		// 문자열 1개만 전달하여 method 호출
		// 문자열을 전달받아 값을 입력받아 결과를 return
	//	inV1.inputValue("새우깡");
		// 문자열 1개와 정수 2개를 전달하여 method 호출
		// 2개의 정수 범위내의 값이 입력됬는지 유효성 검사 실행
		inV1.inputValue("새우깡", 0, 100);
		
		
		
		
	}
}
