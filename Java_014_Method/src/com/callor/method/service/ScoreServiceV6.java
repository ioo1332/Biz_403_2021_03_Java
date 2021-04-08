package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/* subject{"국어","영어","수학"} 배열 선언
 * 성적 정보를 저장할 List<ScoreVO>ScoreList 생성
 * inputScore method 선언 
 * inputServiceV2의 inputValue method 사용하여 5명학생의 각과목의 점수를 입력
 * 입력받은 점수 Score 객체로 생성후 
 * socreList에 add
 * 
 */
public class ScoreServiceV6 {

	/*
	 * 데이터를 입력 
	 * 데이터를 VO에 담고 
	 * 입력된 데이터를 list에 추가
	 * 
	 * 연산을 수행
	 * 
	 * 다시 list에 저장 데이터를 읽어 
	 * list에서 추출하여 VO에 담고 
	 * 출력
	 */
	// final 키워드를 부착한 변수 =상수
	// 상수 = 한번 저장된값을 변경할수 없는 특별한 변수
	protected final int 국어=0;
	protected final int 영어=1;
	protected final int 수학=2;
	
	protected InputServiceV2 inservice;
	protected List<ScoreVO> scoreList;
	int[] KorList;
	int[] EngList;
	int[] MathList;
	protected String[] subject;
	List<ScoreVO> korList;
	List<ScoreVO> mathList;
	List<ScoreVO> engList;

	public ScoreServiceV6() {
		// TODO Auto-generated constructor stub
		inservice = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();
		subject = new String[] { "국어", "영어", "수학" };
		korList = new ArrayList<ScoreVO>();
		engList = new ArrayList<ScoreVO>();
		mathList = new ArrayList<ScoreVO>();
	}

	public void inputScore() {

		for (int i = 0; i < 5; i++) {
			Integer[] scores = new Integer[subject.length];
			for (int sb = 0; sb < subject.length; sb++) {
				scores[i] = inservice.inputValue(subject[i], 0, 100);
				if (scores[i] == null) {
					return;
				}
			}
			ScoreVO scoreVO = new ScoreVO();
			int sbIndex = 0;
			scoreVO.setKor(scores[this.국어]);
			scoreVO.setEng(scores[this.영어]);
			scoreVO.setMath(scores[this.수학]);
			scoreList.add(scoreVO);

		}

	}

	public void inputScore1() {
		for (int st = 0; st < 5; st++) {
			Integer intkor = inservice.inputValue("국어", 0, 100);
			if (intkor == null) {
				return;
			}
			Integer inteng = inservice.inputValue("영어", 0, 100);
			if (intkor == null) {
				return;
			}
			Integer intmath = inservice.inputValue("수학", 0, 100);
			if (intkor == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();

		}
	}
	
	public void printScore() {
		int nSize=scoreList.size();
		
		System.out.println("=".repeat(50));
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]+"\t");
		}
		System.out.println();
		System.out.println("-".repeat(50));
		
		for(int i=0;i<nSize;i++) {
			ScoreVO scoreVO=scoreList.get(i);
			System.out.println(scoreVO.getKor()+"\t");
			System.out.println(scoreVO.getEng()+"\t");
			System.out.println(scoreVO.getMath()+"\n");
		}
		
		
	}

}
