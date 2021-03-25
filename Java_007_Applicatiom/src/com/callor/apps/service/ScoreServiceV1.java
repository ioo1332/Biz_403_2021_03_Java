package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	int[] intNums;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;

	public ScoreServiceV1() {
		intNums = new int[10];
		intKor = new int[10];
		intEng = new int[10];
		intMath = new int[10];
	}

	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < intKor.length; i++) {
			intKor = new int[10];
			intEng = new int[intKor.length];
			intMath = new int[intKor.length];

			intTotal = new int[intKor.length];
			floatAvg = new float[intKor.length];
		}
	}

	public void makeTotal() {
		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float) intTotal[i] / 3;
		}
	}



	public void printScore() {
			System.out.println("==============");
			System.out.println("빛나라 고교 성적리스트");
			System.out.println("==============");
			for(int i=0;i<intKor.length;i++) {
			System.out.printf("%3d\t,intKor[i]");
			System.out.printf("%3d\t,intEng[i]");
			System.out.printf("%3d\t,intMath[i]");
			
			System.out.printf("%3d\t,intTotal[i]");
			System.out.printf("%3d\n,floatAvg[i]");
		}

	}

}
