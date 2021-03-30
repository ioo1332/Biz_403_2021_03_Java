package com.callor.classes;

import java.util.Arrays;

/* 배열
 * 다수의 변수를 묶어서 하나의 그룹처럼 다루는 방법
 * 몇개의 배열을 생성할것인가를 먼저 결정하고 각 배열에 첨자를 사용하여 위치를저장한후
 * ==배열을 사용할때 가장 큰 단점
 * 값을 저장하거나 읽기를 할수있다
 * 
 * 배열의 첨자는 절대 생성된 배열의 갯수보다 큰값을 사용할수없다
 * 생성된 배열에 다시 생성을 하면 이미 저장된 모든값이 사라진다
 */
public class Array_01 {

	public static void main(String[] args) {
		
		int[] intNums=new int[3];
		intNums[0]=10;
		intNums[1]=20;
		intNums[2]=30;
		// intNums 배열의 첨자는 항상 (크기-1) 이내의 값만 사용할수있다
		// intNums[3]=40;
		
		for(int i=0;i<intNums.length;i++) {
			System.out.println(intNums[i]+"\t");
		}
		System.out.println();
		
		/* 이미 값이 저장되어있는 배열의 크기를 변경하기위해 새로운배열을 생성하면
		 * 이미 저장된 모든값이 초기화 되버린다
		 * 배열의 크기를 코드중간에 변경하는경우는 사용하지않는다
		 */
		
		intNums=new int[5];
		intNums[3]=99;
		intNums[4]=88;
		
		System.out.println(Arrays.toString(intNums));
		
		
		
	}
}
