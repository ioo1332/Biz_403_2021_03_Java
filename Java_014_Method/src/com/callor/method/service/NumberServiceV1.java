package com.callor.method.service;

/* 두개의 정수를 매개 변수로 받는다
 * 
 */
public class NumberServiceV1 {

	
	/* method 이름은 addNum()
	 * 두개의 정수를 매개변수로 받는다
	 * 누구나 어디선가 addNum() 호출 할때는 객체.addNum() 형식으로 호출
	 * 2개의 정수를 전달하게 하겠다 => 객체.addNum(100,200)
	 * 두개의 정수를 전달 받기 위해서는 method가 준비를 해야한다
	 * method 의 ()안에 변수를 선언한다
	 * 
	 * 두수의 합을 계산하여 결과가 짝수이면 합을 return하고 return 합; 형식의 명령 필요
	 * 그렇지않으면 null을 return하라 return null; 형식의 명령 필요
	 * 
	 * return 값 형식의 명령이 있으려면 void 가 아닌 return타입을 지정해주어야 한다
	 * 
	 * 단순히 정수만 return 하는 경우는 int 타입으로 하면되지만
	 * 조건에 따라 null값을 return해야하는 경우가 있기때문에 
	 * int 타입이아닌 Integer타입으로 설정
	 */
	
	
	public Integer addNum(int num1,int num2) {
		//TODO 두 정수의 합이 짝수인가 하는 method
		// 첫번째 방법
		// 어떤 연산을 수행하고 연산결과에 따라 return 등을 수행해야하는경우
		// 연산된 결과를 변수에 담아놓고 이후 코드를 진행하자
		int sum =num1+num2;
		if(sum%2==0) {
		}else {
		}
		return null;
		
		// 두번째 방법
		// c언어와같은 함수형 언어에서는 함수를 끝내는 return 문은 한번만 쓰자 라는 
		// 전통적인패턴이있다 전통적인 패턴을 지키는 코드의예
		//Integer sum=null;
		//if((num1+num2)==0) {
			//sum=num1+num2;
		//}
		//return sum;
		
		// 세번째 방법
		//if((num1+num2)%2==0{
		//   return num1+num2;
		//}
		//return null;
	
	}//addNum(int num1,int num2) 끝
		
	
	/* java의 method 는 매개변수에 따라 호출한느 방식이 달라진다
	 * 만약 addNum(정수,정수)방식으로 호출하려면
	 * addNum(int num1,int num2)형식으로 선언해야하고
	 * 
	 * addNum(실수,실수) 방식으로 호출하려면
	 * addNum(float num1,float num2) 방식으로 선언해야한다
	 * addNum(double num1,double num2)
	 * method를 호출할때 전달하는 데이터의 타입에 맞도록 
	 * method가 미리 만들어져있어야한다
	 */
	public Float addNum(float num1,float num2) {
		//TODO 두 실수를 전달받아 짝수인가 판별하는 코드
		float sum=num1+num2;
		if(sum%2==0) {
			return sum;
		}
		
		//method코드가 아직 작성되지않을때
		//문법오류가 나는 것을 방지하는 임시코드
		return null;
	}
	
	public Float addNum(int num1,float num2) {
		return null;
	}
	public Float addNum(float num1,int num2) {
		return null;
	}
	}

