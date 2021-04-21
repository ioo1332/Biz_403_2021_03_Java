package com.callor.blackjack.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.blackjack.model.CardVO;
import com.callor.blackjack.model.DeckVO;
import com.callor.blackjack.model.GameInterface;


public class BlackJackImpl implements GameInterface {

	protected CardVO cardVO;
	protected List<DeckVO> deckList;
	protected Scanner scan;
	
	String strSuit = "다이아◆:하트♡:스페이드♠:클로버♣";
	String strDenomi = "A23456789JQK";
	
	public BlackJackImpl() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		cardVO = new CardVO();
		deckList = new ArrayList<DeckVO>();
		
	}

	@Override
	public void mainMenu() {
		// TODO Auto-generated method stub
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
				System.out.println("게임 시작 카드 돌리기");
				this.makeDeck();
			}
		}
	}
	public void makeDeck() {
		String[] denoms = strDenomi.split("");
		String[] suits = strSuit.split("");

		// 4번 반복
		for (String suit : suits) {
			for (String denom : denoms) {
				Integer intValue = 0;
				try {
					intValue = Integer.valueOf(denom);
					if (intValue == 0)
						intValue = 10;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// denom문자열이 A,K,Q,J 경우
					if (denom.equals("A"))
						intValue = 0;
					else
						intValue = 10;
				}
				DeckVO deckVO = new DeckVO();
				deckVO.setSuit(suit);
				deckVO.setDenomiation(denom);
				deckVO.setValue(intValue);
				deckList.add(deckVO);
			}
			this.getDeck();
		}

	}// end makeDeck
	public DeckVO getDeck() {

		Random rnd = new Random();
		int nSize = deckList.size();

		int deckIndex = rnd.nextInt(nSize);
		System.out.println(deckIndex);
		DeckVO retDeckVO = deckList.get(deckIndex);
		// 카드를 뽑고 덱에서 지움
		deckList.remove(deckIndex);
		this.cardDraw();
		return retDeckVO;
		
	}

	@Override
	public void cardDraw() {
		// TODO Auto-generated method stub
		
		
		

	}

	@Override
	public void resultGame() {
		// TODO Auto-generated method stub
		

	}

}
