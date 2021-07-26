package com.callor.lambda.service;

public class OnClickServiceImplV2 implements OnClickService{

	@Override
	public void onClick(String msg) {
		// TODO Auto-generated method stub
		msg+="반갑습니다";
		System.out.println(msg);
		
	}

}
