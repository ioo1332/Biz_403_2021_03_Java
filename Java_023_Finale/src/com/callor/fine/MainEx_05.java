package com.callor.fine;

import java.util.Random;

public class MainEx_05 {

	public static void main(String[] args) {
		
		Random rnd=new Random();
		int[] nums=new int[100];
		
		//100개의 배열에 임의의정수 100개 저장
		for(int i=0;i<nums.length;i++) {
			nums[i]=rnd.nextInt(100)+1;
		}
		//배열 100개에 저장된 값 중에서 소수인 값들만 출력
		for(int i=0;i<nums.length;i++) {
			int index=0;
			for(index=2;index<nums.length;index++) {
				if(nums[i]%nums.length==0) {
					break;
				}
			}
			//?
			if(nums[i]){
				System.out.println(nums[i]+"소수");
			}else {
				System.out.println(nums[i]+"소수아님");
			}
			
		}
	}

}
