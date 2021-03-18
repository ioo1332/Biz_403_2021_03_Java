package com.collor.var;

public class Varriable_03 {

	public static void main(String[] args) {
		
		/* 변수의 성질1
		 * 코드가Topdown (위에서 아래) 으로 진해오디는 동안 이전에 변수에 어떤값이 저장되었던 상관없이
		 * 	읽는 시점 바로전에 저장된 값만 유효하다
		 */ 
		int intNum1= 0;
		intNum1= 30;
		intNum1= 40;
		intNum1= 50;
		intNum1= 0;
		
		/* 변수의 성질2
		 * 변수에서 값을 읽는 명령들 intNum1에 저장된값을 읽어서 console에 출력하라
		 * 변수에서 값을 읽는 명령이 몇번수행되던 상관없이 한번 변수에 저장된 값은 그대로 유지된다
		 */
		System.out.println(intNum1);
		
		/* 변수의 성질3
		 * 변수에 값 저장, 할당 ,대입 이때 대입연산자(=)를 사용한다
		 * 
		 * 변수 = 값 
		 * 변수 = 식
		 * 변수 = 변수
		 * 
		 * 대입연사자가 명령문중 나타나면 대입산자 오른쪽이 먼저 실행된다
		 */
		
		intNum1=30;
		intNum1=30+40;
		intNum1=intNum1;
		
		/* intNum1에 저장된값을 cpu로 복사해서 보내기
		 * 어딘가에 저장된 100을 cpu로 복사해서 보내기
		 * 두 수를 덧셈하여 다시 intNum1에 저장
		 * 원래 intNum1에 저장된값은 사라지고 170이 intNum1에 저장된다
		 */
		intNum1=intNum1+100;
		intNum1=intNum1*2;
		intNum1=intNum1-1000;
		intNum1=intNum1/2;
		// 위아래 같은 결과지만 아래를 형식을 주로씀
		intNum1 += 100;
		intNum1 *= 2;
		intNum1 -= 100;
		intNum1 /= 2;
	
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		// 1씩증가하는 코드
		intNum1 ++;
		intNum1 ++;
		
		intNum1 --;
		++intNum1;
		
		
		
		System.out.println(intNum1);
		
	}
}
