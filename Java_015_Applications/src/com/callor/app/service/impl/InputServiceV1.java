package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.ioo.standard.impl.InputServiceImplV1;

/* 다음 interface를 impl하여 ScoreServiceImplV1을 생성하고
 * 각 method 구현
 * List<ScoreVO> scoreList 객체 생성
 * 학생 5명의 학번 이름 성적 입력받아 scoreList에 추가
 */
public class InputServiceV1 implements ScoreService {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected ScoreVO scoreVO;

	public InputServiceV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);

	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("성적처리");
			System.out.println("-".repeat(50));
			System.out.println("1.학생별 성적 입력");
			System.out.println("QUIET.업무종료");
			System.out.println("=".repeat(50));
			System.out.println("업무선택>>");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIET")) {
				break;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴는 1,QUIET만 입력가능");
				continue;
			}
			if (intMenu == 0) {
				break;
			} else if (intMenu == 1) {
				this.inputName();
			}
		}

	}

	@Override
	public void inputName() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("학생의 학번을 입력하세요.(QUIT : 메뉴화면)");
			System.out.print(">> ");
			String num = scan.nextLine();
			Integer intInput = null;
			if (num.equals("QUIT")) {
				return;
			} else {
				try {
					intInput = Integer.valueOf(num);
				} catch (NumberFormatException e) {
					System.out.println("학번은 정수로 입력");
					continue;
				}
			}
			scoreVO = new ScoreVO();
			scoreVO.setNum(num);
			this.inputScore();

		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		while (true) {

			System.out.println("학생의 이름을 입력하세요.");
			System.out.print(">> ");
			String name = scan.nextLine();
			System.out.println("국어점수를 입력하세요");
			System.out.print(">> ");
			Integer kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			System.out.print(">> ");
			Integer eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			System.out.print(">> ");
			Integer math = scan.nextInt();

			scoreVO.setName(name);
			scoreVO.setKor(kor);
			scoreVO.setEng(eng);
			scoreVO.setMath(math);
			scoreList.add(scoreVO);

			this.printScore();

		}
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("이름\t학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("=".repeat(50));

		for (int i = 0; i < scoreList.size(); i++) {
			System.out.print(scoreList.get(i).getName() + "\t");
			System.out.print(scoreList.get(i).getNum() + "\t");
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\t");
			System.out.print(scoreList.get(i).getTotal() + "\t");
			System.out.println(scoreList.get(i).getAvg() + "\t");
			scoreList.add(scoreVO);
			return;

		}
	}

}