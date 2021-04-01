package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1 {

	// protected로 선언된 객체,변수는 자동으로 생성되어 상속받은곳에서 사용할수있다
	// Random rnd;

	public void primNum() {

		int rndNum = rnd.nextInt(51) + 50;

		// flag변수 상태를 설정하여 사용할변수
		boolean notPrime = false;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % 1 == 0) {
				notPrime = true;
				break;
			}
		}

		// flag 색깔에 따라 소수, 소수가아님을 출력
		if (notPrime) {
			System.out.println(rndNum + " 는 소수가아님");
		} else {
			System.out.println(rndNum + "는 소수");
		}

	}
}