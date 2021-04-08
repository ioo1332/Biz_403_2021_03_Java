package com.ioo.standard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import com.ioo.standard.impl.InputServiceImplV1;
import com.ioo.standard.impl.InputServiceImplV2;

public class Ex_01 {

	public static void main(String[] args) {
		
		InputService isV1=new InputServiceImplV1();
		InputService isV2=new InputServiceImplV2();
		isV1.inputValue("새우깡");
		isV1.inputValue("새우깡", 0);
		isV1.inputValue("새우깡", 0, 1000);
		
		/* List 인터페이스를 구현한 클래스는 
		 * ArrayList LinkedList Vector 3가지가있다
		 * 3가지의 클래스는 코드에 List인터페이스를 impl했다
		 * 이러한 클래스는 선언과 생성을할때 인터페이스로 선언을하고 
		 * 클래스의 생성자로 객체를 생성하는것이좋다
		 * 
		 * List 인터페이스를 impl한 클래스들은 List 타입의 클래스다 라고 호칭함
		 */
		
		
	}
}
