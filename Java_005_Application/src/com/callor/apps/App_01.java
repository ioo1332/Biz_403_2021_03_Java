package com.callor.apps;

import java.util.Random;

/* 25명~50명 인원이 있는 각반에 피자를 지금하려고한다
 * 각반의 학생들에게 1조각씩 피자를 지급하려고한다
 * 학생수보다 부족하거나 6조각 이상 남지않도록 피자를 주문해야한다
 * 몇박스 주문해야할까
 */
public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		rnd.nextInt();// -2**31~2**31-1 중의수

		rnd.nextInt(10);// 0~(10-1),+1(1~10)
		// 피자 조각수
		int pizzaPcs = 6;

		// 25~50의 수중 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25;// 25~50 수중 하나 만들기

		int pizzaBox = 0;
		// 정수/정수==>몫이 몇개인가
		// 필요한 box수와 같거나 1작은값이 만들어진다
		pizzaBox = intMembers / pizzaPcs;

		boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0;
		// if (bYes==false)
		if (!bYes) {
			pizzaBox++;
		}

		System.out.println("인원수:" + intMembers);
		System.out.println("피자판수:" + pizzaBox);
		System.out.println("피자조각:" + pizzaBox * pizzaPcs);

	}
}
