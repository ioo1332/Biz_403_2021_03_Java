package com.collor.classes.service;

import com.collor.classes.model.IolistVO;

public class IolistServiceV4 extends IolistServiceV1 {
	// alt shift s override~
	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("=================");
		System.out.println("매입 매출 등록");
		System.out.println("-----------------");
		String pname = null;
		while (true) {
			System.out.print("상품명(QUIET:입력중단)>>");
			pname = scan.nextLine();
			if (pname.equals("QUIET")) {
				return;
			} else if (pname.equals("")) {
				System.out.println("상품명은 반드시 입력해야합니다");
				continue;
			}
			break;
		}
		System.out.print("거래일자(yyyy-mm-dd)");
		String date = scan.next();

		System.out.print("거래처 명 >>");
		String dname = scan.next();

		System.out.print("매입매출구분>>");
		String iout = scan.next();

		System.out.print("수량>>");
		Integer qty = scan.nextInt();
		Integer iprice = this.inputPrice("매입");
		if (iprice == null) {
			return;
		}
		Integer oprice = this.inputPrice("매출");
		if (oprice == null) {
			return;
		}
		IolistVO VO = new IolistVO();
		VO.setPname(pname);
		VO.setDate(date);
		VO.setDname(dname);
		VO.setInout(iout);
		VO.setIprice(iprice);
		VO.setOprice(oprice);
		VO.setQty(qty);
		iolist.add(VO);
	}

	private Integer inputPrice(String title) {
		while (true) {
			System.out.println(title + "단가를입력하세요");
			System.out.println(title + "단가는0이상입력하세요");
			System.out.println("-1을 입력하면 입력을 중단합니다");
			System.out.print(title + "단가>>");
			Integer price = scan.nextInt();
			if (price == -1) {
				return null;
			}
			if (price < 0) {
				System.out.println(title + "단가는0이상");
			} else {
				return price;
			}
		}

	}

}
