package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;


public class InputServiceV4 {
	
	protected Scanner scan;
	protected List<NumberVO> numList;
	
	public InputServiceV4() {
		// TODO Auto-generated constructor stub
		scan=new Scanner(System.in);
		numList=new ArrayList<NumberVO>();
		
	}
	public void intputNum() {
		
		System.out.println("2개의정수입력하세요");
		System.out.println("정수1>>");
		String strNum1=scan.nextLine();
		Integer intNum1=Integer.valueOf(strNum1);
		
		System.out.println("정수2>>");
		String strNum2=scan.nextLine();
		Integer intNum2=Integer.valueOf(strNum2);
		
		NumberVO numberVO=new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum1(intNum2);
		
		numList.add(numberVO);
	}
	public void printNum() {
		for (int i=0;i<numList.size();i++) {
			NumberVO vo= numList.get(i);
			System.out.println(vo.getNum1()+"\t");
			System.out.println(vo.getNum2()+"\t");
			this.printNum(vo);
		}
	}
	
	public void printNum(NumberVO vo) {
		// TODO Auto-generated method stub
		System.out.print(vo.getNum1());
		System.out.print(vo.getNum2());
		
		
	}
	
}
