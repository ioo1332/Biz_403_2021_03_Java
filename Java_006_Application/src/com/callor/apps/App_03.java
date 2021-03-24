package com.callor.apps;

import java.util.Random;

public class App_03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int numsLength = 20;
		int[] intNums = new int[numsLength];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		// 요소:배열의 몇번째값
		// 위치:배열의 몇번째
		// 첨자: 배열의 몇번째 인가를 알려주는값
		for (int i = 0; i < intNums.length; i++) {
			if (numsLength % 2 == 0) {
				// 짝수인값을 출력
				// System.out.println(intNums[i]);t

				// 몇번째 위치 (요소,첨자)에 저장되어있나?
				// System.out.println(i);
				System.out.printf("%d번째값:%d\n", i, intNums[i]);

			}

		}
	}
}
