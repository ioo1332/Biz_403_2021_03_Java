package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

/* 랜덤클래스를 이용해 50~100까지중 난수 1개생성
 * 2~(난수-1)까지 수 중에서 생성된 난수의 약수를 찾아 배열에 저장 
 * (난수의 약수 난수 % i ==0 인 i값)
 * 리스트 출력
 */
public class Class_01 {

	public static void main(String[] args) {

		// 랜덤클래스를 이용해 50~100까지중 난수 1개생성
		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;
		// i 값이 0에서 시작하여 1씩증가하면서 100미만일경우 {}명령을 실행해라
		// i 값은 0~99(100-1)까지
		for (int i = 0; i < 100; i++) {
		}
		System.out.println("생성된난수"+intNum);
		// intNum의 약수가 몇개인가를 구하라
		// i 값은 2~(intNum-1) 연속으로 생성
		int nCount = 0;
		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				nCount++;
			}
		}
		System.out.println("약수의개수 : " + nCount);
		int[] divisor = new int[nCount];

		int index = 0;
		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				divisor[index++] = i;
			}
		}
		System.out.println(Arrays.toString(divisor));

	}
}
