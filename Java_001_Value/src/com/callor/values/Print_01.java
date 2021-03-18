package com.callor.values;

public class Print_01 {

	
	public static void main(String[] args) {
		
		// console에 출력하는 명령문
		
		/*
		 * 빈라인(enter)만 출력하라 new line기호 새로 줄바꿈하기
		 */
		System.out.println("a");
		System.out.println();
		System.out.println("b");
		
		/*
		 * print()명령은 괄호안이 비어있는채로 실행할수없다
		 * 줄바꿈이 없이 값을 출력할때 사용
		 */
		System.out.print(3);
		System.out.print(4);
		
		/* 한줄에 연속된결과를 출력한후 다음줄에 다른결과를 출력하고싶으면
		 * println() 을 한번 실행해준다
		 */
		
		System.out.println();
		System.out.println("================");
		
		/* printf() form(형식)에 맞춰 출력하는 명령문
		 * printf(" 형식문자열",값들...)
		 * %와 함께 시작되는 기호들을 사용하여 출력되는 문자열 형식을 만들고
		 * 실제 값들을 채워넣어서 문자열을 완성하여 출력하는 명령문
		 */
		System.out.printf("%d+%d=%d",3,4,3+4);
		System.out.println();
		System.out.printf("%d*%d=%d",3,3,3*3);
		System.out.println();
		
		/* printf() 는 형식에 맞추어 출력하고자
		 * %d : 정수를 표시하는 형식 기호
		 * %s : 문자열을 표시하는 형식기호
		 * %f : 실수를 표시하는 형식 기호
		 */
		
		
		
		
	
	}
}
