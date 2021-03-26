package com.callor.apps.service;

import java.util.Scanner;

public class NumberServiceV1 {

	int intNum = 0;

	Scanner scan = new Scanner(System.in);

	public void inputNum() {

		System.out.println("정수1개를 입력합니다");
		System.out.println(">>");
		intNum = scan.nextInt();

		// main method 가 아닌곳에서
		// scanner를 사용하는경우
		// 사용이 끝나면 close()하자
		// 이제는 Scanner사용이 끝났으니
		// Resource(자원)를 반납하겠다
		scan.close();
	}

	public void checkEven() {

		System.out.println(LinesService.dLines(50));
		if (intNum % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수\n");
		} else {
			System.out.printf("입력한 정수 %d는 짝수가아님");
		}
	}

	public void checkPrime() {
		System.out.println(LinesService.dLines(50));
		int num = 0;
		for (num = 2; num < intNum; num++) {
			if (intNum % num == 0) {
				System.out.printf("입력한 정수%d는 소수가아님", num);
			} else {
				System.out.printf("입력한 정수 %d는 소수\n", num);
			}
		}
	}

}
