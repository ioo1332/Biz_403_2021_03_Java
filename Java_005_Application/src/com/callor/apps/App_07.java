package com.callor.apps;

public class App_07 {
	public static void main(String[] args) {
		/*
		 * 어떤 정수의 단위자리수가 몇개인가를 계산하는 코드
		 * 
		 */
		int intNum = 93929323;
		int nCount = 0;
		System.out.printf("정수%d는", intNum);
		while (intNum > 0) {
			nCount++;
			intNum /= 10;
		}
		System.out.printf("%d자리수의숫자", nCount);
	}
}
