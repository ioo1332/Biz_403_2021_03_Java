package com.callor.controller;

import java.util.Random;

/* 1~100까지 임의의정수 5개를 만들어서그수가 짝수인지 아닌지를 출력하라
 * 
 */
public class Controller_010 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		int num3 = rnd.nextInt(100);
		int num4 = rnd.nextInt(100);
		int num5 = rnd.nextInt(100);

		if (num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수");
		} else
			System.out.println(num1 + "는 짝수아님");
		if (num1 % 2 == 0) {
			System.out.println(num2 + "는 짝수");
		} else
			System.out.println(num2 + "는 짝수아님");
		if (num1 % 2 == 0) {
			System.out.println(num3 + "는 짝수");
		} else
			System.out.println(num3 + "는 짝수아님");
		if (num1 % 2 == 0) {
			System.out.println(num4 + "는 짝수");
		} else
			System.out.println(num4 + "는 짝수아님");
		if (num1 % 2 == 0) {
			System.out.println(num5 + "는 짝수");
		} else
			System.out.println(num5 + "는 짝수아님");

		/*
		 * 반복문을 사용하여 임의정수 100을 만들고 그 수가 짝수인지 아닌지 판별하는 코드
		 */
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt();
			if (num % 2 == 0) {
				System.out.println(num3 + "는 짝수");
			} else
				System.out.println(num3 + "는 짝수아님");
		}

	}
}
