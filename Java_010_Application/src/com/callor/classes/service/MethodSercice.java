package com.callor.classes.service;

public class MethodSercice {

	// 변수는 같은{}내에서는 같은 이름으로 절대 중복 선언할수 없다
	public void method(int num) {
		System.out.println("여기는 1번 method");
	}
	// method는 같은 클래스 {}구역 내에서는 같은 이름으로 원칙적으로 중복 선언할수 없다
	// 예외상황에서는 가능
	// method 의 매개변수의 있고없고, 매개변수의 개수의차이,매개변수의 타입의차이
	public void method(int num,int num1) {
		
	}
	public void method(float num,int num1) {
	}
	/* method를 코드를 작성할때 매개변수를 선언하면
	 * 이 method를 호출할때 반드시 매개변수에 해당하는 값을 전달해야한다
	 * 선언된 매개변수의 개수,타입이 일치하도록 값을 전달해야만한다
	 * 그렇지 않으면 method를 호출하는곳에 오류가 발생한다
	 * 객체.method(30,30.0f);
	 * 
	 */
	public void method(int num, float num1) {
		
	}
	public void method() {
		
	}
}
