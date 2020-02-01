package com.BintoDectoHex;

public class Dec_Hex_Converter {
	public static String DecimalToHexadecimal(int decimal) 
    	{
	        String digits = "0123456789ABCDEF"; //set String digit to hexadecimal Value
	        if (decimal == 0)
	        	return "0";
	        String hexa = "";
	        int digit;
	        while (decimal > 0) 
	        {
	        	digit = decimal % 16;// remainder of decimal value divided by 16 rightmost digit
	            hexa += digits.charAt(digit);  // string concatenation
	            decimal = decimal / 16;
        	}
        return hexa;
    
    } 
}
