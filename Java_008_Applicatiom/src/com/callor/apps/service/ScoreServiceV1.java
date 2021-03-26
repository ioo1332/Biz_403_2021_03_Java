package com.callor.apps.service;

import java.util.Scanner;

/* 5명 학생의 국어 영어 수학 점수를 저장할 배열생성
 * 키보드를 이용하여 5명의 국영수 점수 입력받고 배열에 저장
 * 학생별 총점 평균을 계산하고 리스트 출력
 */
public class ScoreServiceV1 {

	int[] nums;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	
	Scanner scan = new Scanner(System.in);

	public void scoreService() {
		nums = new int[5];
		intKor = new int[5];
		intEng = new int[5];
		intMath = new int[5];
		
	}
	
	
	public void makeScore() {
		for(int i=0;i<nums.length;i++) {
			nums[i]=1+i;
			System.out.printf("학생:%d\t",nums[i]);
			System.out.print("국어:\t"+intKor[i]);
			intKor[i]=scan.nextInt();
			System.out.print("영어:\t"+intEng[i]);
			intEng[i]=scan.nextInt();
			System.out.print("수학:\t"+intMath[i]);
			intMath[i]=scan.nextInt();
		
		
			intTotal[i]=intKor[i];
			intTotal[i]+=intEng[i];
			intTotal[i]+=intMath[i];
			System.out.print("총점\t"+intTotal[i]);
			floatAvg[i]=(float)intTotal[i]/3;
			
		}
	}
		public void printList() {
			System.out.println("==================");
			System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
			System.out.println("==================");
			
			
			
		}
	
		
		
		
		

		

	
}
