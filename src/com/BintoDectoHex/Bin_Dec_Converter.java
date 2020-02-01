package com.BintoDectoHex;

public class Bin_Dec_Converter {
	public static int BinaryToDecimal(String n){  
		  String num = n; //set parameter String n to variable String num
	        int decimal_value = 0; //initalize dec_value as 0
	  
	        // Initializing base value to 1, i.e 2^0     
	        int base = 1; 
	  
	        int length = num.length(); //set int length to the length of String num 
	        for (int i = length - 1; i >= 0; i--) 
	        { 
	            if (num.charAt(i) == '1') 
	            	decimal_value += base; 
	            	base = base * 2; 
	        } 
	  
	        return decimal_value; 
	    
	}
}
