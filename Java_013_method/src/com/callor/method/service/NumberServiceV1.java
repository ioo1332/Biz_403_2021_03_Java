package com.callor.method.service;

/* 
 * Random수를 생성하여 3의 배수 이면 그 수를 
 * 아니면 null을 return 하라
 * ==반드시 어떤값을 return 하라
 * 
 * 대표값으로 어떤 타입의값을 return 할것인가
 * 생성한수가 1~100까지 정수형 난수
 * 3의 배수 이면서 정수인값을 return 하라 - 정수형 3의 배수를 리턴하라
 * 
 * return 타입을 void가 아닌 정수형타입으로 지정해야한다 int 와 Integer
 * null값을 리턴해야하므로 Integer형 사용
 * 
 * void 키워드
 * method return명령어 꼭없어도 되는 경우
 * 
 * 이 method는 정수형 3의배수 또는 null값을 return 해야하기때문에 Integer형 return 타입을 설정해야함
 * void 대신 Integer형 사용
 * 
 * void 대신 Integer형 사용하면 return 명령문과 return할 값(대상)이 코드에 있어야한다
 * 아직 method에 return문이 없기때문에 오류발생
 * method 에 오류가 나는것을 없애기위해 return문을 추가한다
 * 이 method 는 return 명령문만으로는 처리가 되지않고 반드시 return할 값이 있어야한다
 * 
 * primitive 타입중에 숫자형인 경우 0을 
 * wrapper클래스 타입을 사용하는경우  null을 보통 사용함
 */
import java.util.Random;

public class NumberServiceV1 {

	public Integer inpuNum() {
		
		Random rnd = new Random();
		Integer num1=rnd.nextInt(100)+1;
		int num2=rnd.nextInt(100)+1;
		
		if (num1%3==0) {
			return num1;
		}
		if (num2%3==0){
			/* 현재 intputNum() method의 타입은 Integer이다
			 * 그런데 여기서 return 하는 num2 변수의 타입은 int 형이다
			 * 별다른 문제를 일으키진않지만 실체 코드가 작동될때는 
			 * Integer형을 wrapper 클래스형으로 변환하는 과정이 일어난다. 
			 * 
			 */
			return num2;
		}
		
		return null;
	}
}
