package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import com.callor.score.model.ScoreVO;
import com.ioo.standard.InputService;
import com.ioo.standard.impl.InputServiceImplV1;


/* ScoreService 인터페이스를 implements 하여 클래스작성
 * insertScore 에서 학번 국어 영어 수학 점수를 입력받아
 * List<ScoreVO>scoreList에 추가
 * 학번은 00001형식으로 5자리로 변환하여 추가
 * 한번 입력된 학번점수는 다시 입력할수없음
 * printScore등 코드는 임의로 작성
 * 
 */
public class ScoreServiceImplV1 implements ScoreService{
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected String[] subjectList;
	protected Integer[] subScoreList;
 	
	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan=new Scanner(System.in);
		scoreList=new ArrayList<ScoreVO>();
		inService=new InputServiceImplV1();
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList=new Integer[subjectList.length];
		
	}
	
	@Override
	public void insertScore() {
		// TODO Auto-generated method stub
		Integer intNum=inService.inputValue("학번", 1);
		if(intNum==null) {
			return;
		}
		String strNum=String.format("%03d",intNum);
		String strName=null;
		while(true) {
			System.out.println(strNum+"학생 이름 입력(QUIT입력시 중단)");
			strName=scan.nextLine();
			if(strName.equals("QUIT")) {
				return;
			}else if (strName.equals("")) {
				System.out.println("이름은 반드시 입력");
				continue;
			}
			break;
		}
		for(int i=0;i<subjectList.length;i++) {
			subScoreList[i]=inService.inputValue(subjectList[i], 0, 100);
			if(subScoreList[i]==null) {
				return;
			}
		}
		ScoreVO scVO=new ScoreVO();
		scVO.setNum(strNum);
		
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

}
