package com.callor.method.service;

/* inputNumberServiceV1의 inputValue호출 국어 0,100값을 전달후
 * return 된값이 null이면 "종료"출력
 * return 된값이 정수면 "점수 :??"출력
 */
import java.util.Scanner;

/* 전통적인(구조적 프로그래밍)방법
 * 원칙적으로 같은 클래스에서 같은이름의 method는 중복하여 작성 할수 없다
 * ex)
 * inputValue1("새우깡")
 * inputValue2("새우깡",100);
 * inputValue3("새우깡",100,1000);
 * inputValue2("새우깡",100,1000); //매개 변수 오류
 * 
 * public Integer inputValue1(String title);
 * public Integer inputValue2(String title,int start);
 * public Integer inputValue3(String title,int start,int end);
 * 
 * 객체지향 개발 방법에서는
 * 매개변수의 개수,타입,순서가 다르면 같은이름의 method를 중복하여 작성 할수있다
 * ex)
 * public Integer inputValue(String title); //1
 * public Integer inputValue(String title,int start); //2 
 * public Integer inputValue(String title,int start,int end); //3
 * 
 * 객체.inputValue("새우깡",100); //자동으로 2번 method에 연결 호출됨
 * inputValue(100,"새우깡"); //순서가 달라서 매개 변수 오류
 * 
 * 
 */
public class InputServiceV2 {
	protected Scanner scan;

	public InputServiceV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
/* 정수 범위에 대한 유효성검사를 수행하는 method 
 * 밑에 만들어진 inputValue(String title)method에 연동하여 사용하겠다
 */
	
	public Integer inputValue(String title, int start) {
		String msgTitle=String.format("%s(%d이상의)",title,start);
		while(true) {
		Integer intNum=this.inputValue(msgTitle);
		if (intNum!=null) {
			if(intNum<start) {
				System.out.printf("입력값은 %d이상이어야합니다\n",start);
				continue;
			}
			
		}
		return intNum;
		}
	}
	public Integer inputValue(String title, int start, int end) {
		
		// 유효성 검사를 수행하겠다는 메세지 작성
		String msgTitle=String.format("%s(%d~%d)범위의",title,start,end);
		while(true) {
		Integer intNum=this.inputValue(msgTitle);
		// 만약 intNum이 null이 아니면 유효성검사
		// this.inputValue(String title) method가 return해준값이 null이 아니면
		// 유효성검사를 수행하라
		if(intNum!=null) {
			// 유효성검사를 통과하지못하면
			if(intNum<start||intNum>end) {
				// 메세지를 보여주고
				System.out.printf("입력값은 %d~%d까지 입력하세요\n",start,end);
				// 다시 inputValue(String title) method를 호출하여 입력받아라
				continue;
			}
		}
		// inputValue(String title)이 null을 return 했거나
		// 유효한 범위의 정수값을 return했으면 그 값이 담김
		return intNum;
		}
	}

	public Integer inputValue(String title) {
		/* while 사용 이유
		 * exception이 발생했을때 사용자에게 안내메세지를 보여주고
		 * 다시 입력을 받도록하기위한 조치
		 */
		while (true) {
			System.out.println(title + "값을입력하세요(QUIT:입력취소)");
			System.out.println(">>");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				return null;
			} // if조건문이 false일시 실행되는 부분
				// 굳이 else를 사용하지않아도 문제없음
			Integer intNum=null;
			try {
				// 문자열을 숫자값으로 변환시켜 intNum에 저장후 return null로 빠짐
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("입력값오류");
				System.out.println("정수나 QUIT 문자열만 입력하세요");
				continue;
			}
			//try-catch코드가 정상적으로 완료되었을때 실행되는부분
			//입력한값이 정상적으로 정수형 데이터로 변환되어 
			//intNum 변수에 담겨있고 입력한 정수값이 return 된다
			return intNum;
		}
	}
}
