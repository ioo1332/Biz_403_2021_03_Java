package com.callor.app.service.inpl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

/* socreSerivce 인터페이스를 implements 하여 scoreSerivceV2 클래스를 만들고
 * selectMenu method 코드를 구현 
 * 
 */
public class ScoreServiceV2 implements ScoreService {

	protected Scanner scan;

	public ScoreServiceV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1.성적 입력");
			System.out.println("2.성적 리스트 출력");
			System.out.println("3.성적 저장");
			System.out.println("QUIT.종료");
			System.out.println("-".repeat(50));
			System.out.println("업무선택>>");

			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				break;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("메뉴 선택 오류");
				System.out.println("메뉴는 1~2 QUIT만 입력가능");
				continue;
			}
			if (intMenu == 0) {
				break;
			} else if (intMenu == 1) {
				this.inputScore();
			} else if (intMenu == 2) {
				this.printScore();
			}

		}

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
