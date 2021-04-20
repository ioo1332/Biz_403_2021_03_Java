package com.callor.word;

import com.callor.word.service.WordService;
import com.callor.word.service.Impl.WordServiceImplV2;

public class WordEx_01 {
	
	public static void main(String[] args) {
		WordService wService=new WordServiceImplV2();
		
		
			wService.startGame();
		
	}

}
