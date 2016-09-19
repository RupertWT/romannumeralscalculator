package com.rupert.learning.romannumerals;

public class ToRomanNumerals {
	
	public static String toRomanNumeralsTransformer( int decimalNumbers ) {
		
		int[] equivalentValue = new int[13];
		equivalentValue[0] = 1000;
		equivalentValue[1] = 900;
		equivalentValue[2] = 500;
		equivalentValue[3] = 400;
		equivalentValue[4] = 100;
		equivalentValue[5] = 90;
		equivalentValue[6] = 50;
		equivalentValue[7] = 40;
		equivalentValue[8] = 10;
		equivalentValue[9] = 9;
		equivalentValue[10] = 5;
		equivalentValue[11] = 4;
		equivalentValue[12] = 1;
		
		String resultInRomanNumerals = "";
		
		for (int i = 0; i < 13; i++) {
			for (int j = decimalNumbers; j >= equivalentValue[i]; j -= equivalentValue[i]) {
				resultInRomanNumerals += lookup.decimalToRoman(equivalentValue[i]);
				decimalNumbers -= equivalentValue[i];
			}
		}

	   	return resultInRomanNumerals;
    }

}
















