# 변수나 객체의 생명주기 (life cycle)
* 변수나 객체는 선언하고 초기화할때 사용할 준비가 된다
* 변수나 객체는 선언만 하였을 경우 아직 실체가 존재하지 않는다
* 변수나 객체는 선언 후 반드시 초기화(생성)과정을 수행해야 실체가 존재하게 된다

## 변수의 선언과 초기화 (변수에 어떤값을 저장하기)
* 변수 선언: int num;
* 선언된 변수의 초기화 : num=100;
* 변수의 선언과 초기화 : int num=100;

## 객체의 선언과 초기화
* 객체의 선언 : ClassName className; //객체 선언의 일반 패턴
* 객체의 초기화 : className = new. ClassName(); //생성자 호출하여
* 객체의 생성 (선언과 초기화) : ClassName= new ClassName();

## 다른 클래스에 선언된 변수나 객체의 초기화
* 만약 NameService 클래스의 클래스 영역에 선언된 변수나 객체가 있다면
  NameService의 생성자 method에 변수를 초기화하는 코드가 있어야한다
  
## method 내에서 선언된 변수나 객체의 초기화
* 즉시 선언과 생성을 같이 하는것이 좋다
* main() method 에서 변수가 객체를 사용하기 위한 선언,초기화하는것과 같은 원리

## 선언되고 생성된 변수나 객체의 소멸(Destroy)
* 전통적(구조적) 프로그래밍이나 오래된 객체 지향 프로그래밍에서는 
  선언되고 생성된 변수나 객체가 사용이 종료되면 소멸하는 코드가 있어야 한다
*Java의 GC(Garbage Collection) Java에서는 생성된 변수나 객체의 사용이 종료되면 
 자동으로 소멸하는 코드가 내부적으로 실행됨
 
## GC의 작동시기에 대한 고찰
* 맴버 영역에 선언된 변수나 객체는 변수나 객체를 포함한 객체가 사용이 종료되면
  같이 소멸된다
* method의 지역변수 영역에 선언된 변수나 객체는 method가 종료되면 같이 소멸된다
* {}코드블럭 내에서 선언된 변수나 객체는 {}코드블럭이 종료되면 같이 소멸된다

## 변수의 scope
* {]코드블럭 변수의 scope영역이라고 하며
* 변수에 접근(읽기,쓰기)를 할수있는 영역
