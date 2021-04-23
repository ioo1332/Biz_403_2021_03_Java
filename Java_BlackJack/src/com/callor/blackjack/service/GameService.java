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
	protected int p1Deck[];
	protected int p1Index;
	protected int d1Deck[];
	protected int d1Index;
	
	protected int[] deck;
	protected int deckIndex;

	public GameService() {
		// TODO Auto-generated constructor stub
		p1Deck = new int[10];
		d1Deck = new int[10];
		deck = new int[52];
		deckIndex = 0;
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
				this.getp1Deck();
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
	public void getp1Deck() {
		System.out.println("카드를 받겠습니까? [0=NO 1=YES]");
		Integer intP1 = scan.nextInt();
		if (intP1 == 0) { // 카드를 받지 않는 작업
			return;
		}
		if (intP1 == 1) { // 카드를 받는 작업
			p1Deck[p1Index] = deck[deckIndex];
			deckIndex++;
			p1Index++;
		}
		this.getd1Deck();
	}
public void getd1Deck() {
	System.out.println("카드를 받겠습니까? [0=NO 1=YES]");
	Integer intd1 = scan.nextInt();
	if (intd1 == 0) { // 카드를 받지 않는 작업
		System.out.println("겜안함");
		return;
	}
	if(intd1 == 1) { // 카드를 받는 작업
		p1Deck[p1Index] = deck[deckIndex];
		deckIndex++;
		p1Index++;
	}
	
}
public void deckDisplay(int deck[], int index, String title) {
	String cardShape[] = { "스페이스", "클로버", "다이아", "하트" };
	String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	System.out.print(title);
	for (int i = 0; i < p1Index; i++) {
		int cardSIndex = deck[i] / cardNumber.length; // 카드 모양(cardShape) 종류 '0:스페이스/1:클로버/2:다이아/3:하트' 총 0~3의 값
		System.out.print(cardShape[cardSIndex]);
		int cardNIndex = deck[i] % cardNumber.length; // 카드 숫자(cardNumber) 종류 총 0~12의 값
		System.out.print(cardNumber[cardNIndex] + " , ");
	}
	System.out.println();
}
public int getSum(int[] deck, int index) { // 점수 구하기 메소드
	int sum = 0;
	for (int i = 0; i < index; i++) { // A=1 J,Q,K=10으로 점수처리 한것
		int score = 0;
		score = deck[i] % 13 + 1;
		if (score > 10) {
			score = 10;
		}
		sum = sum + score;
	}
	for (int i = 0; i < index; i++) {
		if (deck[i] % 13 == 0) {
			if (sum + 10 <= 21) {
				sum = sum + 10;
			}
		}
	}
	return sum;
}
public void gameDisplay() { // 분배 화면 메소드
	System.out.println("");
	System.out.println(">>카드 현황");
	deckDisplay(p1Deck, p1Index, "p1: ");
	System.out.println("player 총점> " + getSum(p1Deck, p1Index));
	deckDisplay(d1Deck, d1Index, "p2: ");
	System.out.println("dealer 총점> " + getSum(d1Deck, d1Index));
	System.out.println("");
}
	public void startGame() {
		
		

	}

}
