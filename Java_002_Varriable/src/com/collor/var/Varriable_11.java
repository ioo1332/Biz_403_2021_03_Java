package com.collor.var;

public class Varriable_11 {

	public static void main(String[] args) {
	
		
		//처음시작값
		int intNum = 100000;
		
			// intNum에 담긴값을 1증가키고 출력하라
			System.out.println(++intNum); //++inNum 1씩증가
			
		int intSum=0; //결과를 저장할 변수를 생성
		intNum=1; //시작값을 1로
		
		intSum=intSum+intNum;
		System.out.printf("intNum:%d,intSum:%d\n",++intNum,intSum);
		intSum=intSum+intNum;
		System.out.printf("intNum:%d,intSum:%d\n",++intNum,intSum);
		
		
		System.out.printf("intNum:%d,intSum:%d\n",++intNum,intSum+=intSum);
		intNum=intNum+1;
		intSum=intSum+intNum;
		System.out.printf("intNum:%d,intSum:%d",intNum,intSum);
		
		
		
	}
	
}
