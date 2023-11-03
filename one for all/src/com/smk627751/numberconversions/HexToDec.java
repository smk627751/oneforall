package com.smk627751.numberconversions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexToDec {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Hex number:");
		String hex = sc.next();
		boolean pattern = Pattern.matches("[0-9|A-F]{1,10}", hex);
		long res = 0;
		if(pattern)
		{
			for(int i = hex.length()-1,p = 0; i >= 0; i--,p++)
			{
				if(hex.charAt(i) == '0') continue;
				if(Character.isLetter(hex.charAt(i)))
				{
					res += (hex.charAt(i)-55) * Math.pow(16, p);
				}
				else
				{
					res += Integer.parseInt(hex.charAt(i)+"") * Math.pow(16, p);
				}
			}
			System.out.println(res);
		}
		else
		{
			System.out.println("Invalid format");
		}
	}
}
