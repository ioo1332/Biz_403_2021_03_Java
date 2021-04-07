package com.callor.method.service;
/* InputServiceV2 클래스의 inputValue method에
 * "국어",0,100 값을 전달한후
 * return값이 null이면 종료 ,정수값이면 점수:?? 형식으로 출력
 * 
 */
public class ScoreServiceV2 {
	/* IputServiceV2 클래스를 활용하는 method가 2개이상일경우 
	 * 모든변수, 객체를 클래스영역(맴버변수영역)에 선언하자
	 * 그리고 생성자에서 초기화하여 사용해야된다
	 */
	protected InputServiceV2 inservice;
	
	public ScoreServiceV2() {
		// TODO Auto-generated constructor stub
		inservice=new InputServiceV2();
	}
	public void intputScore() {
		// InputServiceV2 를 활용한 method가 한곳일때는 
		// method 지역변수 영역에 선언하여 사용하면된다
		
		// method 내에서 선언된 변수나 객체의 초기화
		// InputServiceV2 inservice=new InputServiceV2();
		Integer intKor=inservice.inputValue("국어",0,100);
		if(intKor==null) {
			System.out.println("종료");
		}else {
			System.out.printf("국어점수:%d",intKor);
		}
		
	}

}
