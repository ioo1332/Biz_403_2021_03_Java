package com.collor.var;

public class Varriable_01 {

	
	public static void main(String[] args) {
		
		/* 정수형 변수 num1 num2를 선언하라
		 * Interger 정수값을 저장할 기억장치를 예약하고
		 * 그곳에 num1,num2 이름을 붙여라
		 * 정수형 변수 num1 num2를 선언하고
		 * 각각변수에 33 55를 저장하라
		 * num1 num2 변수는 사용할 준비가 된다
		 * num1 num2 변수가 생성(초기화)되었다 라고 한다
		 */
		int num1=33;
		int num2=55;
		
		int sum=0;
		int minus=0;
		int times=0;
		int div=0;
		
		sum=num1+num2;
		minus=num2-num1;
		times=num1*num2;
		div=num2/num1;
				
		System.out.println(num1+num2);
		System.out.println(num2-num1);
		System.out.println(num1*num2);
		System.out.println(num2/num1);
		
		System.out.println("===================");
		System.out.printf("%d+%d=%d\n",num1, num2 ,sum);
		System.out.printf("%d-%d=%d\n",num2, num1 ,minus);
		System.out.printf("%d*%d=%d\n",num1, num2 ,times);
		System.out.printf("%d/%d=%d\n",num2, num1 ,div);
		System.out.println("===================");
		
		
		
		
	}
}
