package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;

	public PrimeServiceV1() {
		// TODO
		Random rnd = new Random();
		
	}

	/*
	 * for() 반복문이 실행되거나 끝나는 경우 비교문 "i < rndNum" true 인동안 반복하라 
	 * 만약 rndNum 가 10이다
	 * i==9일때까지 반복하라 
	 * for 반복문이 종료되면 i는 얼마일까 
	 * i값이 rndNum 보다 작으면 {}내의 코드 실행 {}실행후 i++를 실행한다 
	 * i가9가 되었을때 {]을 실행하고 i++가 실행된다 
	 * 때문에 for 반복문이 중단되지않고 모두 정상 수행이 되면 i값은 rndNum값과 같아진다 
	 * i==rndNum인데 i<rndNum 냐고 묻는것 
	 * 만약 for반복문이 중간에 break를 만나면 i값은 항상 rndNum 보다 작다
	 */
	public void PrimeMethod() {
		int rndNum = rnd.nextInt(51) + 50;
		// rndNum가 6이라고 가정
		// 6%2 6%3 6%4 6%5 까지 연산 수행
		boolean notPrime=false;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				// 소수가아닌경우
				// rndNum 를 i 값으로 나머지 연산을했을때 한번이라도 나머지가 0이면
				// 그 수는 소수가 아닌경우라 연산을 할 필요없어짐
				notPrime=true;
				break;
			} else {
				// 소수인경우
			}

		}//for() end 
		//여기에서 for 반복문이 break되었나 아니면 모두 완료되었다
		if (notPrime==true) {
			System.out.println("소수가 아님");
		}else {
			System.out.println("소수임");
		}

	}
}
