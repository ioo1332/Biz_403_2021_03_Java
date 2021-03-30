package com.callor.classes;

import com.callor.classes.service.ValueService;

public class Value_05 {

	public static void main(String[] args) {
		
		ValueService vs= new ValueService();
		
		// vs.nums();
		
		// retNum 맴버변수를 public 으로 선언하면
		// 아래와같이 간편하게 값을 읽을수있다
		// Integer result=vs.retNum;
		
		// retNum 변수는 ValueSErvice의 맴버 변수이다
		// 이 맴버 변수를 외부에서 값을 변경하는것은
		// 코드를 매우 위험스럽게 만드는것이다
		
		// 좋은 방법은 맴버변수를 private로 설정하고
		// vs.retNum=200;
		
		//getter()method를 통하여 읽기전용으로 하는것이 좋다
		Integer result1 = vs.getRetNum();
		
		Integer result2 = vs.numsRet();
	}
}
