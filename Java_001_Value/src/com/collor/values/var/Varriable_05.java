package com.collor.values.var;

public class Varriable_05 {

	
public static void main(String[] args) {
	// 선언하는 문장
	int num1=0;
	int num2=0;
	int sum=0;
	
	// 키워드가 빠지면 값을 저장하는문장
	num1=33;
	num2=40;
	sum=num1+num2;
	
	//계산된 결과를 sum변수에 담아두고 여러번 코드에서 값을 읽어 사용할수 있다
	System.out.printf("%d+%d=%d",num1,num2,sum);
	System.out.println();
	System.out.printf("%d와%d를 덧셈한 결과 %d",num1,num2,sum);
	
	
	
	
	
}
}
