package com.grupodot.test.service.impl;

import org.springframework.stereotype.Service;

import com.grupodot.test.model.Dto;
import com.grupodot.test.model.DtoOut;
import com.grupodot.test.service.PalindromoService;

@Service
public class PalindromoServiceImpl implements PalindromoService{

	
	public DtoOut palindromo(Dto dtoIn) {
		DtoOut out = new DtoOut();
		
		String word = dtoIn.getWord();
		
		if(word != null && word.length()>1) {
			char [] wordAsArray = word.toCharArray();
			
			if(word.length() == 2) {
				if( wordAsArray[0] == wordAsArray[1]) {
					out.setLongestPalindrome(word);
					
				}else {
					out.setLongestPalindrome(word.substring(0,0));
				}
				
			}
			else {
				
				
				int posx=0;
				int posy=0;
				
				int may=0;
				String finalSubstring="";
				
				for(int i =0; i<wordAsArray.length;i++ ) {
					for(int j=i+1;j<wordAsArray.length;j++) {
						
						String subString = word.substring(i,j+1);
						//System.out.println("Substring "+ subString);
						
						if(isPalindrome(subString)) {
							if(subString.length()>may) {
								//System.out.println("Substring is palindrome and is greatest length"+ subString);
								finalSubstring = subString;
								may = subString.length();
								//System.out.println("Length = "+ may);
								posx = i;
								posy = j; 
								//System.out.println("POs x = "+ posx + "  "+"POs y = "+ posy);
							}
						}
						
						
					}
				}
				
				//System.out.println("Final substring "+ finalSubstring);
				out.setLongestPalindrome(finalSubstring);
				//System.out.println("FInaaaal POs x = "+ posx + "  "+"POs y = "+ posy);
				

			}
			
		}
	
		//System.out.println("VOY A RETORNAR ESTAAAA=="+out.getLongestPalindrome());
		return out;
	}
	

	public boolean isPalindrome(String word) {
		
		char[] wordAsArray = word.toCharArray();
		boolean isPalindrome = true;
		
		int i = 0; 
		int j = wordAsArray.length-1;
		
		while(i<=wordAsArray.length && i<j && j>=0  ) {
			if(wordAsArray[i] != wordAsArray[j]) {
				isPalindrome = false;
				break;
			}
			
			i++;
			j--;
		}
		
		return isPalindrome;
	}
	
}
