package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_02 {
	
	public static void main(String[] args) {
		
		String fileName="src/com/callor/score/sample_score.txt"; 
		FileReader fileReader=null;
		try {
			fileReader=new FileReader(fileName);
			for(;;) {
				//read method에는 fileRedaer로 열린파일에서 
				//한바이트씩 데이터를 읽어 ASCII코드로 값을 return
				int result=fileReader.read();
				System.out.printf("%c",result);				
			}
		
			//fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}

}
