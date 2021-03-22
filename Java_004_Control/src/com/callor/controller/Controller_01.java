package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {
	
		// 1. 0~99+1 =1~100
		for(int index=0;index<100;index++) {
		// 1-1.-1~100
			int num=index+1;
			// 2. 3의 배수이면
			if(num%3==0) {System.out.print(num);
			System.out.print(",");
			}
			// 3. 4의 배수이면
			if(num%4==0) {System.out.print(num);
			}
		
			// 3의 배수의 합,4의 배수의 합
			//합을구하기위해 변수를 선언
			int intSum3=0;
			int intSum4=0;
			int intSum5=0;
			for(int index=0;index<20;index++) { 
				int num=index+1;
					
			// num값이 3의배수이면 
			// num갑을 intSum3변수에 누적하라
			// 누적하라 : inSum3변수에 담긴값과 num값을 덧셈하여 다시 intSum3에 저장하라
			if(num%3==0) {
				intSum3+=num;
			}
			/* 여기에서 else if 를 사용하면 3의 배수이면서
			 * 4의배수인경우 3의배수인경우에는 합산이 되지만
			 * 4의배수에는 누락이된다
			  */
			if(num%4==0) {
				intSum4+=num;
			}
			/* 3의배수이면서 5의배수
			 * num%3==0 and num%5==0
			 */

			if (num%3==0) {
				if(num%5==0) {
					intSum5+=num;
				}
			}
			}
			System.out.println("==============");
			System.out.println("3의배수:%d\n,intSum3");
			System.out.println("4의배수:%d\n,intSum4");
			System.out.println("5의배수:%d\n,intSum5");
		}}}


