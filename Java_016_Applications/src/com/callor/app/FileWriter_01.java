package com.callor.app;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/* 랜덤 클래스를 사용하여 0~100까지 범위의 난수 2개를 생성한후 4칙연산을 수행한다
 * FileWriter PrintWriter클래스를 사용하여 4칙연산한 결과를 저장한다
 * 뺄셈과 나눗셈은 큰수-작은수 나눗셈은 큰수/작은수로 연산
 */
public class FileWriter_01 {

	public static void main(String[] args) {
		
		/* 이클립스를 사용하여 프로젝트를 만들었을때
		 * project의 소스코드가 저장되는곳은 
		 * project/src 이후에 패키지 이름으로 만들어진다
		 * 새로운 파일을 만들기 위해서 src/package-name폴더를 지정하는데
		 * 타이핑을 직접하다보면 오타가 발생할수있기때문에
		 * copy.qulified를 사용하여 임의파일 이름을 가져오고 
		 * 필요한 파일로 이름을 변경하여 사용한다  
		 */
		
		String fileName ="src/com/callor/app/data.txt";
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		// 2개의 난수로 사칙연산 수행
		// 뺄셈과 나눗셈은 큰수-작은수 나눗셈은 큰수/작은수로 연산
		if(num1>num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		int sum =num1+num2;
		int minus=num1-num2;
		int time=num1*num2;
		int div=num1/num2;
		
		
		// file과 관련된 클래스를 사용할때는 객체선언과 생성문을 분리하여 작성한다
		// fileWriter와 printWirter를 객체로 선언
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		//객체생성
		//fileWriter클래스를 객체로 생성할때 만들 (작성할,새로생성할)
		//파일이름(경로포함)을 생성자 매개변수로 전달 해주어야 한다
		
		try {
			// fileWriter 클래스의 객체만으로 파일에 기록할수있지만
			// 상당히 복잡하고 불편한 코드를 만들어야한다 
			// printWriter 클래스의 객체를 fileWriter클래스의 객체와 연결하여
			// system.out의 print method와 똑같은 방법으로 파일에 text를 저장한다
			
			// OS <-> FileWriter <-> PringWriter가 서로 연결되어
			// 데이터를 파일에 기록한다
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			
			out.flush();
			out.close();
			
			// PrintWriter를 닫으면 FileWriter도 같이 닫히기때문에 일부러 close하지않아도 된다
			fileWriter.close();
			System.out.println("작 업 완 료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName+"파일 생성 불가");
		}
		
	}

}
