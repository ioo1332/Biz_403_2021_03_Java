package com.callor.app;

import java.util.Scanner;

/* title "값을 입력하세요" 프롬프트 보여주고
 * 정수 또는 QUIT를 키보드를 통해 입력
 * 입력값이 QUIT이면 null 을 return
 * 정수면  입력한 정수값을 return
 * Exception 발생경우 예외처리
 */
public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.println(">>");
			String strInput = scan.nextLine();
			Integer intInput = null;
			if (strInput.equals("QUIT")) {
				return null;
			} else {
				Integer num = null;
				try {
					intInput = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("정수값이나 QUIT 입력");
					continue;
				}
				return num;
			}
		}
		// return null;
	}

	public Integer inputValue(String title, int start) {

		return null;
	}

	public Integer inputValue(String title, int start, int end) {

		return null;
	}
}
