package com.callor.blackjack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.blackjack.model.DeckVO;

public class DeckService {
	protected List<DeckVO> deckList;
	String strSuit = "다이아◆:하트♡:스페이드♠:클로버♣";
	String strDenomi = "A23456789JQK";

	public DeckService() {
		// TODO Auto-generated constructor stub
		deckList = new ArrayList<DeckVO>();
	}

	public DeckVO getDeck() {
		Random rnd = new Random();
		int nSize = deckList.size();

		int deckIndex = rnd.nextInt(nSize);

		DeckVO retDeckVO = deckList.get(deckIndex);
		// 카드를 뽑고 덱에서 지움
		deckList.remove(deckIndex);
		return retDeckVO;

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

}
