package com.callor.apps;

public class Pay_05 {
	public static void main(String[] args) {
		/*
		 * 스위치 변수를 사용한 조건연산 연산이 2가지경우에 서로 달리 수행해야할경우
		 * 
		 * 변수를 1로 시작하고 코드내에서 변수에 -1을 곱하는 코드를 추가하고 변수값이 >0또는<0 경우를 비교연산을 수행하여 코드를 간소화
		 * 할수있게하는 방법
		 * 
		 * for()반복되는 횟수가 처음에 정해진경우 while()반복되는 횟수가 정해지지않고 어떤 조건에 맞춰서 반복이 수행되는 경우
		 */
		int nPay = 3_723_560;
		int nPaper = 50_000;
		int sw = 1;

		for (;;) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권 %5d매\n", nPaper, nCount);
			nPay %= nPaper / 2;
			if (nPay < 0) {
				break;
			}
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
