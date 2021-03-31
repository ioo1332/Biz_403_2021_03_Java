package com.collor.classes;

import java.util.Scanner;

public class ScnnerEx_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer intNum1 = 0;
		Integer intNum2 = 0;
		while (true) {
			System.out.println("========================");
			System.out.println("숫자 2개를 입력하세요");
			System.out.print("숫자 1 (QUIT:중단하기)>>");
			String strNum1 = scan.nextLine();
			if (strNum1.endsWith("QUIET")) {
				// 메인 메서드에서 리턴이 실행되면 어플레케이션을 끝내겠다라는 통보
				return;
			}

			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("숫자로만 입력하세요");
				continue;
			}

			System.out.print("숫자 2 >>");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자로만 입력하세요");
				continue;
			}

			System.out.printf("%dX%d=%d\n", intNum1, intNum2, intNum1 * intNum2);
		}

	}
}
