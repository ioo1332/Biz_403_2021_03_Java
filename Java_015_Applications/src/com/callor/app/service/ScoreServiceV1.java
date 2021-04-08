package com.callor.app.service;
/* InputService interface를 활용하여
 * 한 학생의 국어 영어 수학점수를 입력받고
 * 총점과 평균을 계산하여 출력
 * 점수는 0~100까지
 * 
 */
import java.util.Scanner;

import com.ioo1332.standard.InputService;
import com.ioo1332.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	Scanner scan;
	InputService isV1 = new InputServiceImplV1();

	public ScoreServiceV1() {
	// TODO Auto-generated constructor stub
		scan=new Scanner(System.in);
}

	public void printScore() {
		
		
		
		
	}
}
