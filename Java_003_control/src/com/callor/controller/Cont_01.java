package com.callor.controller;

public class Cont_01 {
	
	public static void main(String[] args) {
		
		// 1.intNum변수를 0으로 초기화하여 생성한후 intNum변수를 활용하여 다음과 같은결과를 출력합니다
		
		int intNum=0;
		// 단독으로 사용할떄는 ++위치상관없음
		intNum=intNum++;	
		
		// ++가 다른명령문과 함께 사용될때는 변수의 앞,뒤에 따라 결과가 달라진다
			System.out.println("==================");
		// for문에는 가급적 ++를 붙이지 않는다
		for(;intNum<10;) {
			++intNum;
			System.out.printf("%d.우리나라 대한민국\n",intNum);
		}
			System.out.println("==================");
		// main()메서드의 코드는 탑다운으로 진행이 된다 코드가 정상 진행되는 과정에서
		// for() 명령문을 만나면 조건을 검사하고 조건에 따라 반복하는 코드가 실행된다
		// 이처럼 탑다운으로 진행되는 코드의 흐름을 바꾸는 명령을 "제어명령","control명령"
			
			intNum=0;
			for(intNum=0;intNum<10;intNum++) {
				System.out.println(intNum);
			}
		/* for()명령을 만나면 intNum을 실행한다 
		 * 이 명령은 반복횟수와 관계없이 최초에 한번만 실행된다
		 * 
		 * intUum<10 을 실행하여 조건 검사결과가 true면 {}의 명령을 실행한다
		 * 명령실행이 끝나면 다시 for()명령문 시작으로 되돌아 온다
		 * 증가: intNum++ 명령을 실행
		 * 조건 검사 : intNum<10
		 * 증가,조건검사를 반복하면서 조건검사 결과가 false가 될때까지 반복하여 {}의 명령을 실행
		 */
		
		
	}

}
