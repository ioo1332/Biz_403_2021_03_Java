package com.callor.apps;
/* 정수형배열을 20개선언 
 * 짝수들의 리스트 출력 
 * 짝수들의합을 계산하여 출력
 */
import java.util.Random;

public class App_01A {
	/* {]내에 있는 코드는 최소화하자 
	 * 작은일들로 분해하기
	 * 나누어서 정복하기 :Divide and Conquer
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
	
		int[] intNums = new int[20];
		int intSum = 0;
		for (int i = 0; i < 20; i++) {
			// 먼저 선언되어있는 배열에 값을 저장하기
			intNums[i] = rnd.nextInt(100) + 1;
			if (intNums[i] % 2 == 0) {
				System.out.println(intNums[i] + "는짝수");
			}

			intSum += intNums[i];

		}
			System.out.println("짝수의합" + intSum);
	}

}
