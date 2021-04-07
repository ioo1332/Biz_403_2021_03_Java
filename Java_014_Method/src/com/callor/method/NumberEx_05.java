package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.ScoreServiceV5;

public class NumberEx_05 {
	
	public static void main(String[] args) {
		
		ScoreServiceV5 inService = new ScoreServiceV5();
		Scanner scan = new Scanner(System.in);
		inService.printScore();
		inService.inputScore3();
		
	}

}
