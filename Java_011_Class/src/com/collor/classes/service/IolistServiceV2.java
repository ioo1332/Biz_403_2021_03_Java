package com.collor.classes.service;

import com.collor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {
	/*
	 * V1의 input method를 재정의 한다 매입단가 매출단가는 반드시 0 이상이어야 한다 유효성 검사를 하도록 코드르 재정의한다
	 */
	@Override
	public void input() {
		// TODO 매입 매출 등록

		System.out.println("=================");
		System.out.println("매입 매출 등록");
		System.out.println("-----------------");
		System.out.print("상품명>>");
		String pname = scan.next();

		System.out.print("거래일자(yyyy-mm-dd)");
		String date = scan.next();

		System.out.print("거래처 명 >>");
		String dname = scan.next();

		System.out.print("매입매출구분>>");
		String iout = scan.next();

		System.out.print("수량>>");
		Integer qty = scan.nextInt();

		// 매입단가와 매출단가는 0이상만 입력
		// 매입단가가 0이상이면 다음 항목 입력받도록
		// while 문을 중단하고
		// 매입단가가 0미만이면 계속해서 반복문내에서 입력을받도록
		// 유효성 검사
		Integer iprice = 0;
		while (true) {
			System.out.print("매입단가>>");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("매입단가는 0원 이상 입니다");
			} else {
				break;
			}
		}
		Integer oprice = 0;
		while (true) {
			System.out.print("매출단가>>");
			oprice = scan.nextInt();
			if (oprice < 0) {
				System.out.println("매출단가는 0원 이상 입니다");
			} else {
				break;
			}
		}
		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(iout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);
		// iolistVO에 저장한 데이터를 확인하기
		this.printIolist(iolistVO);
		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);
	}
}
