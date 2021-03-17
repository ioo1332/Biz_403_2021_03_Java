package com.callor.values;

public class Values_06 {

	public static void main(String[] args) {
		
		System.out.println(33%2);
		
		//33을 2로 나눈 나머지가 1이냐 == true
		System.out.println((33%2)==1);
		//33을 2로 나눈 나머지가 0이냐 ==false
		System.out.println((33%2)==0);
		
		//어떤수를 2로나누어서 나머지가 0이면 그 어떤수는 짝이고 그렇지 않으면 홀수이다
		
		System.out.println((33%2==0?"짝수":"홀수"));
		
		System.out.println(33%2); //결과표시
		System.out.println(33%2==0); //0이냐?
		
		// 연산 ? "true 일때 : false 일때"
		System.out.println((33%2)==0?"짝수":"홀수");
		
		System.out.println(33>10);
		System.out.println(33>10? "33이 10보다 크다":"33은 10보다 작다");
		
		// 상향연산자 
		// 비교 ? true : falsse 와 같이 항목이 3가지가 구분되어있는 연산		
		System.out.println(3==3? "맞아":"아닌데");
		System.out.println();
		System.out.print("3==3 연산이 ture이냐?:");
		System.out.println(3==3? "맞다":"아니다");
		
	}
}
