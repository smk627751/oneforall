package com.smk627751.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsV2 {

	public static String reverse(String str)
	{
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i) != ' ')
			rev = str.charAt(i) + rev;
			
			else
			{
				return rev + " " + reverse(str.substring(0,i));
			}
		}
		
		return rev;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String: ");
		String str = input.readLine();
		System.out.println(reverse(str));

	}

}
