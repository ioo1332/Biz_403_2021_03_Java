package com.callor.blackjack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.blackjack.model.CardVO;
import com.callor.blackjack.model.DeckVO;

public class GameService {
	protected Scanner scan;
	protected CardVO cardVO;
	protected List<DeckVO> deckList;

	public GameService() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		cardVO = new CardVO();
		deckList =new ArrayList<DeckVO>();
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
				this.getDeck();
			}
		}
	}// end mainMenu
	public DeckVO getDeck() {
		
		Random rnd=new Random();
		int nSize=deckList.size();
		
		int deckIndex=rnd.nextInt(nSize);
		System.out.println(deckIndex);
		DeckVO retDeckVO=deckList.get(deckIndex);
		//카드를 뽑고 덱에서 지움
		deckList.remove(deckIndex);
		return retDeckVO;
		
	}
	public void startGame() {
		
		

	}

}
