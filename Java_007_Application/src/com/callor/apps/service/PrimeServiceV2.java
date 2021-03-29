package com.callor.apps.service;

import java.util.Random;

public class PrimeServiceV2 {

	int[] intNums;
	public PrimeServiceV2() {
		intNums= new int[20];
	}
	
	public void makeNums() {
		Random rnd=new Random();
		for(int i=0;i<intNums.length;i++) {
			intNums[i]=rnd.nextInt(51)+50;
		}
		
	}
	public void printPrime() {
		for (int num:intNums) {
			int index=0;
			for(index=2;index<num;index++) {
				if(num%index==0) {
					break;
				}
			}
			//중간에 break만났다
			if (index>=num) {
				System.out.println(num+"는 소수");
				//소수가 아님을 출력
			}
		}
	}
	
}
