package com.callor.method.service;

import java.util.Scanner;

/* inputNumberServiceV1의 inputValue호출 국어 0,100값을 전달후
 * return 된값이 null이면 "종료"출력
 * return 된값이 정수면 "점수 :??"출력
 */
public class ScoreServiceV1 {
	protected Scanner scan;

	public ScoreServiceV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);

	}

	public Integer inputScore() {
		InputServiceV1 inV1 = new InputServiceV1();
		Integer retNum = inV1.inputValue("국어", 0, 100);
		while (true) {
			if (retNum == null) {
				System.out.println("종료");
			} else {
				System.out.printf("점수:%d", retNum);
			}

			return null;
		}

	}
}