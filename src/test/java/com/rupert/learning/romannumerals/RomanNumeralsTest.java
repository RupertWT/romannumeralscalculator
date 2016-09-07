package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumerals rn = new RomanNumerals();
  
//	Single character values	
	
	@Test
    public void I_Returns_One() {
        assertEquals(1, rn.fromRomanNumeralsTransformer("I"));   
    }
	
	@Test
    public void V_Returns_Five() {
        assertEquals(5, rn.fromRomanNumeralsTransformer("V"));   
    }
	
	@Test
    public void X_Returns_Ten() {
        assertEquals(10, rn.fromRomanNumeralsTransformer("X"));   
    }
	
	
	@Test
    public void L_Returns_Fifty() {
        assertEquals(50, rn.fromRomanNumeralsTransformer("L"));   
    }
	
	
	@Test
    public void C_Returns_OneHundred() {
        assertEquals(100, rn.fromRomanNumeralsTransformer("C"));   
    }
	
	@Test
    public void D_Returns_FiveHundred() {
        assertEquals(500, rn.fromRomanNumeralsTransformer("D"));   
    }
	
	@Test
    public void M_Returns_OneThousand() {
        assertEquals(1000, rn.fromRomanNumeralsTransformer("M"));   
    }
	
	
	
//	Basic adding of character values
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, rn.fromRomanNumeralsTransformer("II"));   
    }
		
	@Test
    public void VIII_Returns_Eight() {
        assertEquals(8, rn.fromRomanNumeralsTransformer("VIII"));   
    }
		
	@Test
    public void XI_Returns_Eleven() {
        assertEquals(11, rn.fromRomanNumeralsTransformer("XI"));   
    }
	
	@Test
    public void XVI_Returns_Sixteen() {
        assertEquals(16, rn.fromRomanNumeralsTransformer("XVI"));   
    }
	

//	Subtraction of character values	
	
	@Test
    public void IV_Returns_Four() {
        assertEquals(4, rn.fromRomanNumeralsTransformer("IV"));   
    }
	
	
}
