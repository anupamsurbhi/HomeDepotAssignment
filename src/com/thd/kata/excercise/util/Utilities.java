package com.thd.kata.excercise.util;

public class Utilities {
	

	public  Boolean isNumeric(String val) {
		val = val.replaceAll("\\s", "");
		return val.chars().allMatch(Character::isDigit);
	}


	public  Integer toNumeric(String val) {
		return Integer.valueOf(val);
	}
	
	
	public Integer abcVariance(String input1, String input2) {
		
		return 	Math.abs( toNumeric(input1) - toNumeric(input2));

	}

}
