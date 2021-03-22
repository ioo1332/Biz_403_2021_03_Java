package com.callor.controller;

/* 1~100까지 범위의 임의정수 10개를 만들고
 * 3의배수인지 검사하고 3의배수이면 출력하고
 * 수들의 합을 출력하여라
 */
import java.util.Random;

public class Controller_012 {

	public static void main(String[] args) {

		Random rnd = new Random();
		/*
		 * 1~100까지 랜덤수 10개 10개의 숫자가 모두 다르게 만들어라
		 */
		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 3 == 0) {
				System.out.println(num);
				intSum += num;
			}
		}
		System.out.println("================");
		System.out.printf("합계:%d", intSum);
		// for문 {}안에서 선언된변수 num는 for명령이 끝나면 소멸된다
		// 변수i 도 for문안에서 선언되었기때문에 명령이 끝나면 소멸된다
		// System.out.println(num);

		/*
		 * scope {}: 변수의 사용범위를 제한하는 역할을한다 작성하는 코드는 main(){}내에 있다 여기서 선언된 모든변수는 
		 * main() 메서드가 종료하면 모두 소멸된다 for () {} 내에 선언된 모든변수는 for() {} 반복문이 종료되면 모두 소멸된다
		 * 
		 * if(){} 내에 선언된 모든변수는 if(){} 비교문이 종료되면 모두 소멸된다
		 * 
		 * for(){} if(){} 명령이 시작되기전에 선언된 변수들은 for if 명령문 내에서 사용(저장,유지)가 가능하고 for () if()
		 * 명령이 종료되어도 그값을 유지한다
		 * 
		 * for() 반복문이 수행되는동안에 어떤값을 누적(합산)하거나 할때 for() 반복문이 시작되기전에 
		 * 변수를 반드시 선언하고 0으로 clear
		 * 하는것이 좋다
		 */
	}

}
