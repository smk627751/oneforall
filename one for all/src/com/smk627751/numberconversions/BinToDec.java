package com.smk627751.numberconversions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BinToDec {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number:");
		String bin = sc.next();
		boolean pattern = Pattern.matches("[0-1]{1,32}", bin);
		
		long res = 0;
		if(pattern)
		{
			for(int i = bin.length()-1,p = 0; i >= 0; i--,p++)
			{
				if(bin.charAt(i) == '0') continue;
				res += Integer.parseInt(bin.charAt(i)+"") * Math.pow(2, p);
			}
			System.out.println(res);
		}
		else
		{
			System.out.print("Invalid format");
		}
		
	}
}
