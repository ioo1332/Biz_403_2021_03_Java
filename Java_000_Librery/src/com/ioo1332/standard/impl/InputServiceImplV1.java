package com.ioo1332.standard.impl;

import java.util.Scanner;

import com.ioo1332.standard.InputService;

/* 인터페이스를 implements한 클래스는 이름을 지을때 보통 접미사에 Impl을 붙임
 * 인터페이스를 impl한 클래스는 인터페이스에 설계된 추상 method를
 * 반드시 구체적인 코드로 구현해야한다
 * 만약 아직 구체적인 코드가 구현 되지 않았더라도
 * method의 형태는 삭제 할수 없다
 * 
 * 이러한 규칙을 적용하여 다른 클래스와 연동할때
 * 편리하고 오류가 없도록 하기 위함이다
 * 
 */
public class InputServiceImplV1 implements InputService{
	
	protected Scanner scan;
	public InputServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan=new Scanner (System.in);
	}

	@Override
	public Integer inputValue(String title) {
		// TODO 프롬프트 타이틀을 보여주고 정수 입력받기
		while(true) {
			System.out.println(title+"값을 입력하세요 (QUIT는 입력 중단)");
			System.out.print(">>");
			String strIn=scan.nextLine();
			if(strIn.equals("QUIT")) {
				System.out.println("입력취소");
				return null;
			}else {
			Integer intIn=null;
			try {
				intIn=Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("정수값만 입력");
				continue;
			}
				return intIn;
			}
		}//end while
	
	}
	

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method
		title=String.format("%s(%d이상)", title,start);
		while(true) {
			// intIn에 저장된값 == inputValue(String title)이 return해준값
			Integer intIn=this.inputValue(title);
			if(intIn!=null) {
				if(intIn<start) {
					System.out.printf("입력값은 %d이상으로",start);
					continue;
				}
			}return intIn;
		}//end while
		
		
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목,시작값 ,종료값으로 유효성검사 method
		
		while(true) {
			title=String.format("%s(%d~%d범위의)", title, start,end);
			Integer intIn=this.inputValue(title);
			if(intIn!=null) {
				if(intIn<start||intIn>end) {
					System.out.printf("값은 %d~%d까지만입력",start,end);
					continue;
				}
			}
			return intIn;
		}
		
	}

	
}
