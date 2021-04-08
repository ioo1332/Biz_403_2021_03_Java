package com.callor.app;

import com.ioo1332.standard.InputService;
import com.ioo1332.standard.impl.InputServiceImplV1;


public class ScoreServiceEx_01 {
	
	
	public static void main(String[] args) {
		InputService isV1=new InputServiceImplV1();
		isV1.inputValue("국어", 0, 100);
		isV1.inputValue("영어", 0, 100);
		isV1.inputValue("수학", 0, 100);
		
	}
	
	
	
	

}
