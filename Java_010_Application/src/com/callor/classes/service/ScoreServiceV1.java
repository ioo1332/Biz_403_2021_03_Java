package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;
/* 접근제한자
 * public, private, protected
 * class, method, 맴버 변수를 선언할때 사용하는 키워드
 * 접근제한자는 사용하지 않아도 문법적인 오류가 발생하지는 않는다
 * 
 * 객체이론에 "정보은닉(감춘다,제한적 접근,데이터 보호)"
 * public : 모두에게 개방, 모두에게 공개, 누구나 접근(읽기, 쓰기, 실행)을 하게한다
 * 			Class obj = new Class()
 * 			obj.method()
 * 			obj.변수 = 100;
 * private : 현재 클래스(파일)에 있는 코드에서만 접근가능
 * 			obj.변수=100; //문법 오류가 난다
 * protected : 객체를 통해서는 직접 접근 금지
 * 			Class obj=new Class()
 * 			obj.method()방식으로는 접근이 안된다 
 * 			클래스를 상속받게 하겠다 라는 전제하에 상속을 받은 클래스에서는 자유롭게 접근가능
 *			부모 클래스와 상속받은 자식클래스간에 공유하는 목적 
 *
 */
public class ScoreServiceV1 {
	
	/* 맴버변수를 protected로 선언해두면 현재클래스(V1)를 상속받은 자식 클래스에서
	 * 변수가 선언된 것처럼 동작할수 있다.
	 * 
	 * 상속을 허락하고, 맴버 변수를 공유하고자 할때는 protected를 추가한다
	 * 
	 */
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceV1() {
		scan=new Scanner(System.in);
		scoreList=new ArrayList<ScoreVO>();
	}
	public Integer inputScore() {
		//System.out.println("학번 001 형식으로 입력하세요");
		//System.out.println(">>");
		//String strNum=scan.next();
		
		/* scroeList의 데이터 개수를 계산하여 
		 * 입력할 학번을 자동으로 생성하기
		 */
		int nSize=scoreList.size();
		String strNum=String.format("%03d",nSize,+1);
		int intKor=0;
		while(true) {
		System.out.println(strNum+"번의 국어점수를 입력하세요 (중단:-1)");
		System.out.println(">>");
		intKor=scan.nextInt();
		if(intKor==-1) {
			return -1;
		}else if (intKor<0||intKor>100) {
			System.out.println("국어점수는 0~100까지!!");
			continue;
		}
		break;
		}
		
		System.out.println(strNum+"번의 영어점수를 입력하세요");
		System.out.println(">>");
		int intEng=scan.nextInt();
		
		System.out.println(strNum+"번의 수학점수를 입력하세요");
		System.out.println(">>");
		int intMath=scan.nextInt();
		
		ScoreVO scoreVO=new ScoreVO();
		scoreVO.num=strNum;
		scoreVO.kor=intKor;
		scoreVO.eng=intEng;
		scoreVO.math=intMath;
		scoreList.add(scoreVO);
		
		return 0;
		
	}// inputScore()
	
	public void printScore() {
		for(int i=0;i<scoreList.size();i++) {
			// scoreList의 i번째 저장된값을 읽어서
			// ScoreVOgud sVO 객체에 담기
			ScoreVO sVO=scoreList.get(i);
			System.out.print(sVO.num+"\t");
			System.out.print(sVO.kor+"\t");
			System.out.print(sVO.eng+"\t");
			System.out.print(sVO.math+"\n");
			
		}
	} //pirntScore()
	
	public void printHeader() {
		System.out.println("* 빛나라 고교 성적처리 V1");
		System.out.println(Lines.dLin(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차\t");
		System.out.println(Lines.sLine(50));
		
	}
	
	

}
