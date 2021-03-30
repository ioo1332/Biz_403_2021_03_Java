package com.callor.classes.service;

public class Lines {

	public static String dLin(int nCount) {
		// printf() 는 화면에 출력하는 form을 만드는 
		// 출력 method
		// String.format()은 화면에 출력하는대신 문자열로 만ㄷ르어 retrun하는 method
		// 만들어진 문자열을 dLine변수에 담는다
		
		// nCount 값이 50이라면
		// %050d 형식의 format 문자열이 생성될것이다
		String dline=String.format("%0"+nCount+"d", 0).replace("0","=");
		
		return dline;
	}
	public static String sLine(int nCount) {
		return String.format("%0"+nCount+"d",0).replace("0","-");
	}
	public static String dLine11(int nCount) {
		//print ("="*10): 문자열을 10개만들어서 출력
		
		//java11 이상에서연속된 문자열을 만드는 메서드
		String dLine="=".repeat(nCount);
		return dLine;
	}
	}

