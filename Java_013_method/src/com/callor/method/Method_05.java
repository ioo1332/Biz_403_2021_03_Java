package com.callor.method;

import com.callor.method.service.NumberServiceV3;

public class Method_05 {

	public static void main(String[] args) {
		
		NumberServiceV3 nsV3=new NumberServiceV3();
		nsV3.inputNum();
		Integer retNum=nsV3.inputNum();
		if(retNum==null) {
			System.out.println("업무종료");
		}else {
			System.out.println("입력된정수"+retNum);
		}
	}
}
