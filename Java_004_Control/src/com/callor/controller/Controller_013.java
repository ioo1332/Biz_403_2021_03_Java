package com.callor.controller;

import java.util.Random;

public class Controller_013 {

	public static void main(String[] args) {

		// 1~100까지 범위의 랜덤수를 10개 만들고
		// 짝수인지 검사하여 짝수인값들만 합산하여 출력하여라
		/*
		 * intSum변수를 어디에 선언할까? 
		 * 짝수들을 어디에서 합산할까 어디에서 출력할까
		 */
		Random rnd = new Random();
		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 2 == 0) {
				intSum += num;
			}

		}
		System.out.println("=============");
		System.out.println("합계:" + intSum);
		System.out.println("=============");

	}
}
