package com.ioo.standard;
/* interface
 * java언어를 사용하는 프로젝트를 구현할때 모든 코드는 클래스를 기초로 만들어진다
 * 클래스를 만들기 위해서는 여러가지 조건에 맞도록 설계를 해야한다
 * 설계를 하고 설계된 내용으로 문서화 하는데 실제 개별현장에서 문서화된 설계 내용은
 * 잘 지켜지지 않는 경우가 많다
 * 
 * 그러한 상황이 많아지면 여러 클래스가 연동되는 프로젝트의 경우 
 * 특히 method 이름을 다르게 혹은 잘못지어 코드 연결(연동)이 어려워진다
 * 
 * 인터페이스는 여러 개발자들이 협업을 할때 클래스, method 규칙을 코드로 구현하여
 * 클래스를 만들때 반드시 implements 하도록 강제한다
 * 인터페이스를 inpl한 클래스는 인터페이스에 설계된 추상 method를
 * 반드시 자신이 만들 클래스에서 구현해야한다
 * 그러한 규칙을 강제함으로서 연결,연동시 혼란을 최소화 하는것이다 
 * 
 * 키보드로 정수를 입력받기 위한 나의 클래스
 * 키보드로 정수를 입력받으면서 
 * QUIT를 입력받으면 입력을 취소하고 null을 return
 * 정수를 입력받으면 정수값을 return
 */
public interface InputService {
	//추상화 단계 추상화 클래스 like설계도
	public Integer inputValue(String title);
	public Integer inputValue(String title,int start);
	public Integer inputValue(String title,int start,int end);

}
