package com.callor.controller;

public class Cont_03 {

	
	public static void main(String[] args) {
		
		// 0~9까지 출력하기
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		/* i++ 와 i+1의차이
		 * 1.변수i의 저장된값이 변경되느냐 아니냐
		 * 
		 * i++: i에 저장된값이 1증가하는 값으로 변경
		 * 변경된i값을 다른 명령에서 사용하려고할때
		 * for()반복문내에서 i++를 사용할때는 주의해야함
		 * for()반복문의 반복횟수가 변경되어버림
		 * 
		 * i+1: i에 저장된값은 변경되지않는다
		 * i변수에 저장된값에 1을 덧셈하여 임시적으로 다른 명령에서 사용하려고할때
		 */
		
		for(int i=0;i<10;i++) {System.out.println("=============");}
		for(int i=0;i<10;i++) {System.out.println("우리나라"); }
		for(int i=0;i<10;i++) {System.out.println("대한민국");}
		for(int i=0;i<10;i++) {System.out.println("=============");	}
		for(int i=0;i<10;i++) {		}
		
		for(int i=0;i<10;i=+2) {System.out.println("Republic of Korea");		}
		System.out.println("=============");
		/* for()반목문내에서 i++를 실행하고 {for본문명령문}내엣 i--를 실행한다
		 * 이런상황이 되면 i값은 i<10조건에서 항상 true상태가 되어 무한반복코드가 되버린다
		 */
		for(int i=0;i<10;i++) {i--;System.out.printf("대한민국만세");}
	}
}