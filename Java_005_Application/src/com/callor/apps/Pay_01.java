package com.callor.apps;

public class Pay_01 {
	public static void main(String[] args) {

		int nPay = 3_723_560;
		int nPaper = 50_000;
		// 정수=정수 / 정수 :소수점이하가 잘린다
		// 몫을 구하여 액면가액만큼 개수를 계산
		int nCount = nPay / nPaper;
		System.out.println(nPaper + "원권:" + nCount);

		// 액면가액만큼 개수를 구했으면
		// nPay에서 액면가액 금액만큼을 빼고 이후에 계산
		// 3723560%50000=>50000*매수만큼을 3723560에서 뺀값이 된다
		// nPay=nPay-(nPaper*nCount)
		// nPay = nPay%npaer
		nPay %= nPaper;

		nCount = nPay / 10000;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 2;

		nCount = nPay / 5000;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 5;

		nCount = nPay / 1000;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 2;

		nCount = nPay / 500;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 5;

		nCount = nPay / 100;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 2;

		nCount = nPay / 50;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 5;

		nCount = nPay / 10;
		System.out.println(nPaper + "원권:" + nCount);
		nPay %= nPaper;
		nPaper /= 2;
	}
}
