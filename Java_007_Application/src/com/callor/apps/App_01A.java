package com.callor.apps;

public class App_01A {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 11;

		// 9가 소수가 아님을 알려주기
		for (int index = 2; index < num1; index++) {
			if (num1 % index == 0) {
				System.out.println(num1 + "는 소수가 아님");
				break;
			} else {
				// num1의 값이 소수가 아니더라도 계속해서 소수라는 메시지가 출력된다
				System.out.println(num1 + "는 소수다");
			}
		}
		// 11이 소수인것을 판별하라
		boolean notPrime = false; // flag변수
		for (int index = 2; index < num2; index++) {
			if (num2 % index == 0) {
				// num2가 소수가 아닌것이 발견되면
				// notPrime 변수에 true를 설정
				notPrime = true; // flag 변수 셋팅
				break;
			}
		}
		// for ()반복문이 모두 완료되었거나
		// 중간에 break를 만나서 중단되었거나

		// setting되거나 그렇지 않은 경우를 판단하여결과를 출력하기
		if (notPrime) {// notPrime==true
			// num2가 소수가 아닌경우
			System.out.println(num2 + "는 소수가 아님");
		} else {
			System.out.println(num2 + "는 소수다");
		}
		num2 = 10;
		int num = 0;
		for (num = 2; num < num2; num++) {
			if (num2 % num == 0) {
				break;
			}

			/*
			 * for 반복문에서 시용할 num(index)변수를 for 반복문 시작전에 선언을 하고 
			 * 실행을 하면 for 반복문이 종료된후에 num값을 읽을수 있다
			 * 
			 * 이때 1.만약 중간에 break를 만나서 for() 가 중단되거나 
			 * 2. break없이 for 반복문이 모두 완료되거나할텐데 
			 * 1과 2의경우에 num변수 의 상태가 다르다
			 * 
			 * 보통은 num변수의 값은 조건문에 최대값과 같다 
			 * 1번의 경우 num 값은 num2보다 항상작다 
			 * 2번의 경우 num 값은 num2보다 크거나
			 * 같다 if(num==num2)라는 비교문을 사용하는것보단 
			 * if(num<num2)조건문을 사용하는것이 논리적인 문제를 최소화 할수있다
			 */
			if (num == num2) {
				System.out.println(num2 + "는 소수이다");
			} else
				System.out.println(num2 + "는 소수가아니다");
		}
		// 논리적인 오류를 최소화 하기위해
		// 비교 연산자를 1개만 사용하여 검사할수있는 코드를 사용하는것이 좋다
		if (num < num2) {
			System.out.println(num2 + "는 소수가아니다");
		} else
			System.out.println(num2 + "는 소수이다");
		System.out.printf("num2:%d,num:%d", num2, num1);
	}
}