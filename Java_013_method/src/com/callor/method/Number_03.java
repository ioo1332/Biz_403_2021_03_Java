package com.callor.method;

import java.util.Scanner;

public class Number_03 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를입력");
		System.out.println(">>");
		String  strInput=scan.nextLine();
		// trim()문아열의 앞 뒤에붙은 white space제거하는 method
		
		strInput=strInput.trim();
		strInput.equals("QUIT");
		
		// 입력된 문자열에 혹시 있을지모를 whitespace를 제거하고 
		// 문자열이 QUIT인가를 검사하는 코드
		// 객체의 chainning
		if(strInput.trim().equals("QUIT")) {
			System.out.println("종료합니다");
		}else {
			/* 예외 처리
			 * Integer.valueOf(문자열) 코드가 실행되는동안
			 * NumberFormatException이 발생하면 코드가 중단되는데
			 * 코드가 중단되지않고 사용자에게 메시지등을 전달하고 
			 * 적절한 연산코드를 추가하여 코드가 중단되지않고 코드를 계속 진행하도록하는 조치
			 * 
			 * 예외 처리 코드는 개발자에게는 상당히 불필요한 코드를 추가하여 부담을 주는것일수있다
			 * 하지만 적절한 예외처리를 해준 코드는 end user(실제사용자) 에게 
			 * 불편함을 최소한으로 주는 적절한 방법이다
			 * 
			 * end user에게 좋은 코드를 작성하는 개발자는 결국 좋은 개발자가 된다
			 */
			// 블럭 하고 Alt Shift Z  
			try {
				int intNum=Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("숫자가 아닌 값을 입력하였음");
				System.out.println("숫자로 변환하는동안 오류");
			}
			
			
		}
	}

}
