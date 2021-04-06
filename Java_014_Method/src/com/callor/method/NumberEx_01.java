package com.callor.method;

/* 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어)
 * 한개의 모듈(파일)또는 한 프로젝트에서 같은 이름의 함수를 선언할수 없다 
 * 객체지향 프로그램언어 (java)에서는 한개의 클래스(파일) 내에서
 * 같은 이름의 함수를(method) 한 클래스 에서 중복하여 선언할수 있다
 * 단 조건이있는데 매개 변수가 달라야한다
 * 매개변수의 타입 ,개수, 순서가 다르면 같은 이름의 method를 중복 선언할수 있다
 */
import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {
		// NumberServiceV1 호출한다
		NumberServiceV1 nsV1 = new NumberServiceV1();
		// 두개의 매개변수를 갖는 addNum()method에게
		// 정수 31과 29를 전달하고
		// 그결과를 retNum변수에 담아라
		Integer retNum = nsV1.addNum(31, 29);
		if (retNum == null) {
			System.out.println("결과는 짝수가 아님");
		} else {
			System.out.printf("결과 [%d]는 짝수", retNum);
		}

		/*
		 * addNum(float num1,float num2)method는 return 타입이 Float 이기 때문에 return 되는 결과값을
		 * 저장하는 변수도(retNum) 반드시 float형이여야한다
		 * 
		 */
		// Integer reNum1 = nsV1.addNum(30.2f,33.2f);
		Float retNum1 = nsV1.addNum(30.3f, 30.2f);
		// NullPointException 발생
		// float retNum2 = nsV1.addNum(30.3f,30.2f);

		/*
		 * 변수를 선언하는 방식에 primitive 방식과 wrapper class방식이 있다
		 * 
		 * 특히 숫자를 다루는 경우에는 항상 숫자값만 저장된다는 보장이 있을경우는 primitive 방식으로 선언해도 아무런 문제가 없다
		 * 
		 * java나 DB 와 연동되는 프로젝트를 구현할때는 null 이라는 특별한값을 항상 인식해야한다 어떤결과가 null값을 갖게 되는 경우
		 * primitive 방식에선느 취급이 불가능하다
		 * 
		 * 이럴때는 변수를 선언할때 wrapper class 방식을 사용하는것이 바람직하다
		 * 
		 */
		// 객체지향 특징중 다형성
		// method 의 중복 선언
		// 같은 이름의 method 가 한개의 클래스에 중복선언되있어도
		// 전달하는 값의 타입에 따라 java는 자동으로 매개변수 형식과 일치하는 
		// method를 찾아서 연결해준다
		//public Float addNum(int num1,int num2)가 호출
		nsV1.addNum(30, 40);
		//public Float addNum(float num1,float num2)가 호출
		nsV1.addNum(30f, 40f);
	}
}