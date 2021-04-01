package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> primeList;

	public PrimeServiceV4() {
		// TODO Auto-generated constructor stub
		rnd = new Random();
		primeList = new ArrayList<Integer>();

	}

	public void PrimeNum() {
		for (int i = 0; i < 50; i++) {
			int rndNum = rnd.nextInt(51) + 50;
			boolean notPrime = false;
			for (int index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					notPrime = true;
					break;
				}
			}
			// if(notprime) {
			// if(notprime==false){
			// 소수가아닌경우는 필요없으므로 앞에 !붙이고 else지움
			if (!notPrime) {
				primeList.add(rndNum);

			}
		} // end primeNum()
	}

	public void pirntPrime() {
		// 배열, 리스트 구조의 데이터들을 전체를 반복하여 처리할경우

		// for (int i=0;i<primeList.size();i++){
		// Integer Prime =primeList.get(i)
		// 위의 2줄의 명령문을 한번에 실행하는 효과
		for (Integer prime : primeList) {
			System.out.println(prime);
		}
	}
}
