package com.callor.method.service;

/*
 * 정수 또는 QUIT를 키보드를 통해 입력받는다
 * 입력값이 QUIT면 null을 return 정수면 정수값을 return 한다
 */
import java.util.Scanner;

public class InputNumberServiceV1 {
	protected Scanner scan;

	public InputNumberServiceV1() {
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub

	}
	/*
	 * Scanner class 는 키보드 자원을 연동하여 키보드로부터 값을 입력받기 위한 클래스이다 
	 * 이 클래스는 컴퓨터의 자원을 사용하는 관리가 매우 엄격하게 필요한 클래스이다 
	 * 사용하는 방법에 따라 오류가 발생하거나 심지어 컴퓨터 시스템 멈추는 현상까지 발생 할수있다 
	 * 이러한 클래스는 사용할때 상당한 주의가 필요하다
	 */

	// Scanner 클래스르 main()method 가 아닌 Service 등의 클래스에서
	// 사용할때는 클래스 영역에 선언을 하고
	// 클래스의 생성자에서 생성 하는것이 좋다

	/* 문자열 ,정수 ,정수 매개변수를 갖는 method 선언
	 * 문자열과 범위 (start~end)값을 전달받아
	 * prompt문자열을 생성하고
	 * inputValue (String tilt)method를 호출하여 값을 입력받도록하고
	 * return된 값에 따라 null이 return 되면 그냥 return 해버리고
	 * 정수값이 return 되면 start end 값 범위에 있는 값인지 유효성검사하고
	 * 범위를 벗어나면 다시 입력하도록 반복한다
	 */
	
	public Integer inputValue(String title,int start,int end) {
		//title 변수값을 "새우깡(0~100)"문자열로 다시 생성
		title =String.format("%s(%d~%d)",title, start,end);
		Integer retNum =this.inputValue(title);
		while(true) {
		if(retNum==null) {
			return null;
		}else if(retNum<start||retNum>end) {
				System.out.printf("입력값은 %d~%d범위여야합니다",start,end);
				continue;
			}
		return null;
		}
		}
	
	/*
	 * String title 매개변수를 받고
	 * 정수값이나 QUIT가 입력되는지 확인을하고 잘못입력된값이 있으면 
	 * 다시입력받도록 하는 method
	 */
	
	public Integer inputValue(String title) {
		while (true) {
			
			System.out.println(title + "값을 입력하세요(QUIT 입력=>취소)");
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
					System.out.println("정수나 QUIT를 입력하세요");
					continue;
				}
				return num;
			}
		}

	}
}
