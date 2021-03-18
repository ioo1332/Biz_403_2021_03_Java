package com.collor.var;

public class Varriable_12 {

	public static void main(String[] args) {
		
		int intSum=0;
		int intNum=0;
		
		intNum+=100;
		System.out.println(intNum); // 100출력
		
		intNum+=33;
		System.out.println(intNum); // 133출력
		
		intSum+=intNum;
		System.out.println(intSum); // 133출력
		
		intSum+=intNum; //133+133
		intSum+=intNum; //133+133+133
		intSum+=intNum; //133+133+133+133
		System.out.println(intSum);
		
		intSum=0; //0+1+2+3+4+5를 계산해서 inSum에 저장해놔라
		intSum=intSum+1+2+3+4+5;
		System.out.println(intSum);
		intSum=0;
		intSum=intSum+1; //a코드
		intSum=intSum+2; //b코드
		intSum=intSum+3; //c코드
		intSum=intSum+4; //d코드
		intSum=intSum+5; //e코드
		
		intSum=0;
		intNum=1;
		
		intSum=intSum+intNum; // a코드와 동일
		intSum=intSum+(intNum+1); //b코드와 동일 intSum=intSum+(++intNum)
		intSum=intSum+(++intNum);
		
		System.out.println(intSum);
		
	}
}
