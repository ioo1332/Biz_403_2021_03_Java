package com.callor.apps;

public class Pay_04 {
	public static void main(String[] args) {

		int nPay = 3_723_560;
		int nPaper = 50_000;
		int sw = 1;

		// for(;;) { 몇번반복하겠다할때
		// while(조건){} 조건에 만족하는동안
		// 조건=비교연산문이 true인 동안 무한 반복 실행하는 반복문
		while (nPay > 0) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권 %5d매\n", nPaper, nCount);
			nPay %= nPaper / 2;

			// nPaper 2 또는 5로 나누기
			if (sw > 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
			sw *= (-1);

		}
	}
}
