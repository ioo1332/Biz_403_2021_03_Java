package com.callor.controller;

import java.util.Random;

public class Controller_011 {

	public static void main(String[] args) {

		// 1~100까지의 임의의 숫자 5개를 만들고
		// 그수가 3의배수인지 아닌지를 판별하여 출력하시오

		Random rnd = new Random();

		// 0~(100-1) 까지 숫자 랜덤 출력
		// rnd.nextInt(100);

		// 1부터 100까지 임의의 숫자 5개 생성
		for (int i = 0; i < 5; i++) {
			// 100까지의 임의의 숫자 생성
			int num = rnd.nextInt(100) + 1;
			// 3의배수인지 아닌지 판별
			if (num % 3 == 0) {
				// 3의배수인지 아닌지 출력
				System.out.println(num + "는 3의 배수");
			} else
				System.out.println(num + "는 3의배수 아님");

		}

	}
}