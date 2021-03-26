package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;
/* 정수 배열 5개생성
 * 키보드를 통해서 정수5개를 입력받아 배열생성
 * 입력된 배열의 합
 */
import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		int linelength = 20;

		System.out.println(LinesService.dLines(linelength));
		System.out.println("정수값을 입력하고 Enter 눌러주세요");
		System.out.println(LinesService.sLines(linelength));
		for (int i = 0; i < num.length; i++) {
			System.out.printf("정수%d:", i + 1);
			num[i] = scan.nextInt();
		}
		System.out.println(LinesService.sLines(linelength));		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.print("입력된 숫자 ");
		System.out.println(Arrays.toString(num));
		System.out.println(LinesService.sLines(linelength));
		System.out.printf("정수의 합 %d\n", sum);
		System.out.println(LinesService.dLines(linelength));

	}

}
