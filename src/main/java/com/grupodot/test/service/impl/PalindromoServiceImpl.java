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
				
				int cont = 0;
				int posx=0;
				int posy=0;
				
				int finx=0;
				int finy=0;
				int may=0;
				
				
				for(int i = 1; i<wordAsArray.length;i++) {
										
					int j = i-1;
					int k = i+1;
					
					while(j>-1 && k<wordAsArray.length) {
						
						System.out.println("j=="+j +"   "+ "K=="+k);
												
						if(wordAsArray[j]==wordAsArray[k]) {
							System.out.println("Equalsr=="+wordAsArray[j]+" y "+wordAsArray[k]);
							cont++;
							posx=j;
							posy=k;
							System.out.println("posx=="+posx+"  "+"posy=="+posy);
							
						}else {
							System.out.println("NOT Equalsr=="+wordAsArray[j]+" y "+wordAsArray[k]);
							if(cont>may) {
								System.out.println("cont>may==");
								finx=posx;
								finy=posy;
								may=cont;
								
							}
							cont =0;
							System.out.println("Antes break   finx =="+finx+"   "+"finy=="+finy);
							break;
						}
						System.out.println("fuera de los ifs"+ "posx=="+posx+"  "+"posy=="+posy);
						System.out.println("finx =="+finx+"   "+"finy=="+finy);
						
						j--;
						k++;
						
					}
					
					cont=0;

				}
				System.out.println("Fuera for finx =="+finx+"   "+"finy=="+finy);
				out.setLongestPalindrome(word.substring(finx, finy+1));

			}
			
		}
	
		System.out.println("word=="+out.getLongestPalindrome());
		return out;
	}
	

	
	
}
