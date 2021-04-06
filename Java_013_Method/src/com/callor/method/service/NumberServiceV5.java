package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {
		NumberServiceV4 nsV4 = new NumberServiceV4();
		nsV4.inputNum();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.println("값은 0~100까지 입력하세요");
			System.out.println("QUIT 입력:취소");
			System.out.println(">>");
			String strInput = scan.nextLine();
			Integer intInput = null;
			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intInput = Integer.valueOf(strInput);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("입력 오류 숫자로만 입력해주세요");
					continue;
				}

			}
			if (intInput > 0 || intInput > 100) {
				System.out.println("범위를 벗어남");
				continue;
			}
			return intInput;
		}
	}
}
