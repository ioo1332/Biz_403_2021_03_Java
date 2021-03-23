package com.callor.apps;

import java.util.Random;

/*
 * 5학급의 학생들에게 피자 간식을 지급 하려고 합니다.
 * 학급의 인원은 50 ~ 59명입니다
 * 학급 인원은 Random 클래스를 이용하여 생성합니다
 * 피자는 1box에 6조각입니다
 * 다음과 같이 주문 리스트를 출력합니다.
 */
public class App_04A {
	public static void main(String[] args) {

		Random rnd = new Random();
		int pizzaPcs = 6;

		int[] intClasses = new int[5];

		for (int i = 0; i < 5; i++) {
			// (0~(??-1))+@@
			// @@: 시작값을 지정
			// 50~59중의 임의의수
			int members = rnd.nextInt(10) + 50;
			intClasses[i] = members;
		}

		// 학급별 주문수량을 계산하는 부분과
		// 리스트를 출력하는 부분을 분리
		// 1.계산된 주문 수량을 담아둘 장소를 생성
		// 2.저장된 주문수량을 사용 하여 출력

		// 학급별 주문수량을 계산하여 저장할 배열
		int[] intOrders = new int[5];
		for (int i = 0; i < 5; i++) {
			int order = intClasses[i] / pizzaPcs;
			// 인원수 대비 피자조각수를 비교하여 부족할경우 1box추가
			if (intClasses[i] % (order * pizzaPcs) > 0) {
				order++;
			}
			intOrders[i] = order;
		}
		System.out.println("피자주문서");
		System.out.println("============");
		System.out.println("순번\t인원\tBOX\t조각");
		System.out.println("---------------");
		int intTotalOrders = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intClasses[i] + "\t");
			System.out.print(intOrders[i] + "\t");
			System.out.println(intOrders[i] * pizzaPcs);
			intTotalOrders += intOrders[i];
		}
	}
}