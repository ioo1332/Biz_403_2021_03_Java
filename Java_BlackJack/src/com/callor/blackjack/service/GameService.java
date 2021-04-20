package com.callor.blackjack.service;

import java.util.Scanner;

import com.callor.blackjack.model.CardVO;

public class GameService {
	protected Scanner scan;
	protected CardVO cardVO;

	public GameService() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		cardVO = new CardVO();
	}

	public void mainMunu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("블랙잭 게임 시작합니다");
			System.out.println("-".repeat(50));
			System.out.println("1. 게임 시작");
			System.out.println("QUIT. 종료");
			System.out.println(">> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴는 1,QUIET만 입력가능");
				continue;
			}
			if (intMenu == 1) {
				System.out.println("카드 돌리기");
				this.startGame();
			}
		}
	}// end mainMenu

	public void startGame() {

	}

}
