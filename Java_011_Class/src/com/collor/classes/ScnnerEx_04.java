package com.collor.classes;

import java.util.Scanner;

public class ScnnerEx_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("2개의 숫자를 입력합니다");
		System.out.println("단 QUIT를 입력하면 중단합니다");
		System.out.print("숫자 1>>");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return;
		}
		try {
			Integer intNum = Integer.valueOf(strNum);
			System.out.println("입력한숫자의 제곱" + intNum * intNum);
		} catch (Exception e) {
			System.out.println("입력한값이 숫자가 아니여서 제곱을 계산할수없음");
		}

	}
}
