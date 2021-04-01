package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {

	Scanner scan;
	List<Integer> intList;

	public InputServiceV3() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	// 숫자 말고 문자 입력할때 유효성 검사
	public void inputNum() {
		while (true) {
			System.out.println("정수 50~150까지 입력");
			System.out.println(">>");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			try {
				// int inNum1=Integer.valueOf(strNum);
				intNum = Integer.valueOf(strNum);
				// 정수형숫자가 아닌 수 입력시 되돌아감
			} catch (Exception e) {
				System.out.println("값은 정수형 숫자로만 입력하세요");
				continue;
			}
			// 범위벗어난 수 입력시 되돌아감
			if (intNum > 50 && intNum < 150) {
				intList.add(intNum);
				break;
			}else {
				System.out.println("정수는 50~150 범위내에서 입력");
			}
		}

	}
}
