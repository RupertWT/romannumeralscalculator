package com.rupert.learning.romannumerals;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanNumerals 
{
	
	private Dictionary<String, Integer> arabicToRomanDictionary() 
	{
		
		Dictionary<String, Integer> arabicToRomanDictionary = new Hashtable<String, Integer>();
	   
		arabicToRomanDictionary.put("I", 1);
		arabicToRomanDictionary.put("V", 5);
		arabicToRomanDictionary.put("X", 10);
		arabicToRomanDictionary.put("L", 50);
		arabicToRomanDictionary.put("C", 100);
		arabicToRomanDictionary.put("D", 50);
		arabicToRomanDictionary.put("M", 1000);
		
	    return arabicToRomanDictionary;
	}
	
	
	public int fromRomanNumeralsTransformer( String RomanNumerals )
    {

		Dictionary<String, Integer> arabicToRomanDictionary = arabicToRomanDictionary();
		
    	int Answer = 0;
    	
    	for (int i = 0; i < RomanNumerals.length(); i++) {
   		
   			Answer += arabicToRomanDictionary.get(RomanNumerals.substring(i, i+1));
   			
    	}
 
    	return Answer;
    	
    }
    
}