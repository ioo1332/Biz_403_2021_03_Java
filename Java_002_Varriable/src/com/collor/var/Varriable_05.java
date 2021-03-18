package com.collor.var;

public class Varriable_05 {

	public static void main(String[] args) {
	
		int intNum=1;
		int intSum=0;
		
		intSum+= intNum; //1
		intNum++; //2
		intSum+=intNum; //intSum=1+2
		intNum++; //3
		intSum+=intNum; //intSum=3+3
		intNum++; //4
		intSum+=intNum; //intSum=6+4
		

		System.out.println(intNum);
		System.out.println(intSum);	
	
	}
}
