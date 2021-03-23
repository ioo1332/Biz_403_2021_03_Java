package com.callor.apps;

/*5명 학생의 3과점수의 성적표만들기
 * 
 */
import java.util.Random;

public class App_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		// 과목3가지를 학생수만큼 배열 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		// 가상의점수 생성
		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}

		// 총점과 평균을 계산하여
		// 저장해두기
		int[] intTotal = new int[5];
		float[] floatAvg = new float[5];

		for (int i = 0; i < 5; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float) intTotal[i] / 3;
		}
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intAllTotal = 0;

		// 리스트출력
		System.out.println("=================");
		System.out.println("학번\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("-----------------");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");

			System.out.print(intTotal[i] + "\t");
			System.out.printf("%3.2f", floatAvg[i]);
			System.out.println();
			intKorTotal += intKor[i];
			intEngTotal += intEng[i];
			intMathTotal += intMath[i];
			intAllTotal += intTotal[i];
		}
		System.out.println("=================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n", intKorTotal, intEngTotal, intMathTotal, intAllTotal);
	}
}
