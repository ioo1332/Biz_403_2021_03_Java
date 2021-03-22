package com.callor.controller;

import java.util.Random;

public class Controller_015 {

	public static void main(String[] args) {
		
		Random rnd=new Random();
		
		int intKor1=rnd.nextInt(100)+1;
		int intKor2=rnd.nextInt(100)+1;
		int intKor3=rnd.nextInt(100)+1;
		int intKor4=rnd.nextInt(100)+1;
		int intKor5=rnd.nextInt(100)+1;
		
		/* num변수하고 intKor이름 합쳐서 1~5처럼 만들수있을거같은데 안된다
		 * intKornum이라고 작성하면 java는 intKornum 라는 변수를 찾으려고 시도한다
		 *  
		 */
		
		
		int intKor=0;
		int intSum=0;
		intSum+=intKor;
		float floatAvg=(float)intSum/3;
		
		System.out.println(intKor);
				
		
		for(int i=0;i<100;i++) {
			intKor=rnd.nextInt(100)+1;
			
			
		}
		
	}
}
