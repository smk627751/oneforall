package com.smk627751.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String: ");
		String str = input.readLine();
		String temp="";
		for(int i=0;i<str.length();i++)
	      {
	    	  temp = str.charAt(i)+temp;
	      }
	    System.out.println(temp);
      }
}


