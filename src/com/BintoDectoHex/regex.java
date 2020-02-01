package com.BintoDectoHex;

public class regex {
	public static String AsciiCheck(String binary_value)
	{
		String result="";
		for(int i=0; i<binary_value.length();i++)
		{
			char char_bin=binary_value.charAt(i); //set variable character char_bin to binary value in place of i
			int ascii=binary_value.charAt(i); // set variable int ascii to binary value in place of i
			if((ascii==48||ascii==49)) //if the ascii value is 48 or 49 which is ascii value of int 0 or 1
			{
				result+=Character.toString(char_bin); //iterate through all character and convert back to String
			}
		}
		return result;
	}
}
