package com.callor.score.servcie.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.ioo.standard.impl.InputServiceImplV1;

/* ScoreServiceImplV1을 상속받고
 * 
 * inputScore method를 작성
 * 학번 학생이름 3과목 성적 입력받아 List<scoreVO> scoreList객체에 추가
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected String[] subjectList;
	protected Integer[] subScoreList;
	protected final int 국어 = 0;
	protected final int 영어 = 0;
	protected final int 수학 = 0;

	public ScoreServiceImplV2() {
		// TODO Auto-generated constructor stub
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];
	}

	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("%03d", intNum);
		String strName = null;
		while (true) {
			System.out.println(intNum + "번 학생 이름 입력 해주세요");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("이름 입력");
				continue;
			}
			break;
		}
		for (int i = 0; i < subjectList.length; i++) {
			String subject = subjectList[i] + "점수";
			Integer intScore = inService.inputValue(subject, 1, 100);
			if (intScore == null) {
				return;
			}
			subScoreList[i] = intScore;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {

		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(50));
	}// end printscore

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		String fileName = null;
		while (true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.println(">>");
			fileName = scan.nextLine();
			if (fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력");
				continue;
			}
			break;
		}
		String strFileName = "src/com/callor/score" + fileName;
		FileWriter fileWriter = null;
		PrintWriter out = null;

		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n", vo.getAvg());

			}
			out.flush();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
	}

}
