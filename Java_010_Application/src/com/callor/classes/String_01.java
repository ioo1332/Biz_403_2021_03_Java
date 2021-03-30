package com.callor.classes;

public class String_01 {

	public static void main(String[] args) {

		System.out.printf("%50d\n", 0);
		// %50d : 50개짜리 칸을 만들고 오른쪽 끝부터 정수값을 채워라 (오른쪽정렬)
		String dLine = String.format("%50d", 0);
		System.out.println(dLine);
		// %050d : 50개까지 칸을 만들고 오른쪾 끝부터 정수값을 채워라
		// 그리고 값이 남으면 빈칸을 0으로 채워라
		dLine = String.format("%050d", 0);
		System.out.println(dLine);
		
		// dLine 문자열 변수에 문자열0이있으면 문자열 = 로 변경하여라
		dLine=dLine.replace("0","=");
		System.out.println(dLine);
		
	}

}
