package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class Class_02 {

	public static void main(String[] args) {
		/* 자바에서 제공되는 사용이 매우 편리한 배열 자료 구조
		 * 1. 몇개의 데이터를 저장할지 미리 정하지않아도된다
		 * 2. 필요에 따라 개수를 늘리거나 줄일수있다
		 * 3. 매우 다양한 여러가지 기능이 이미 준비되어있다
		 * 
		 * Integer형의 데이터를 다수 저장(list형 데이터)할 intlist 객체 선언
		 * Integer[] intlist=new Integer[??];
		 * 
		 * list 클래스를 사용하여 intList 객체를 선언한다
		 * 단 intList에는 Integer 형 데이터만 저장할수있다
		 * <Integer> : Generic 선언
		 * 저장된 데이터의 타입을 규정하는방법 
		 * primitive형은 포함할수 없다
		 * 반드시 wrapper class 형만 포함
		 * 
		 * list형 객체:Lise 클래스를 사용한 객체
		 * 선언할때는 List 를 사용하고 생성할때는 ArrayList생성자를 사용
		 * 
		 * list형 객체를 선언하고 ArrayList로 생성하면 size가 0인 배열객체가 생성되는것과 유사하다
		 */
		List<Integer>intList=new ArrayList<Integer>();
		
		List<String> strList=new ArrayList<String>();
		
		List<Long> longList=new ArrayList<Long>();
		
		List<Double> douList=new ArrayList<Double>();
		
		List<Boolean> booList=new ArrayList<Boolean>();
		
		List<Float> floatList=new ArrayList<Float>();
		
		List<Character> charList=new ArrayList<Character>();
		// 배열에 값을저장할때는  원하는 length만큼 배열을 선언 생성하고
		// 첨자를 사용하여 위치를 지정한후 값을 저장
		int[] nums=new int[5];
		nums[0]=100;
		
		// List형 객체에 데이터를 저장할때는 추가를 하여 저장
		// List형 객체에 데이터를 추가할때는 .add 메서드를 이용하여 데이터를 추가한다
		// intList 사이즈가 1이된고 자동으로 0번위치에 100이 저장
		intList.add(100); // 0번
		intList.add(200); // 1번
		intList.add(300); // 2번
		
		//intList의 0번째 위치에 저장된값을 읽고싶다
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));
		// 값을 읽을때 저장된 데이터 개수의 범위를 벗어날수없다/
		// 위에서 add()를 3번 실행했기 때문에 사이즈는 3이되고 get을 수행할때
		// index 값은 size-1까지만 사용할수있다.
		// System.out.println(intList.get(3));		
		
		
	
		
		
		
		
		
	}
}
