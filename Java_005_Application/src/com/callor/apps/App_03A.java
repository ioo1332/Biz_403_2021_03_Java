package com.callor.apps;

import java.util.Random;

public class App_03A {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intScores = new int[10];

		for (int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
		}
		int intTotal = 0;
		float floatAvg = 0;

		for (int i = 0; i < 10; i++) {
			intTotal += intScores[i];

		}
		// 평균은 전체 총점을 계산한후에 한번만 계산을 수행하면 된다
		// 평균을 총점과 같이 for반복문에서 계산할필요없다
		floatAvg = (float) intTotal / 10;
		System.out.println("==============");
		System.out.printf("총점:%d,평균:%3.2f\n", intTotal, floatAvg);
		System.out.println("==============");
	}
}
