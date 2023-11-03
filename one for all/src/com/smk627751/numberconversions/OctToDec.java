package com.smk627751.numberconversions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OctToDec {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an octal number:");
		String oct = sc.next();
		boolean pattern = Pattern.matches("[0-7]{1,10}", oct);
		long res = 0;
		
		if(pattern)
		{
			for(int i = oct.length()-1,p = 0; i >= 0; i--,p++)
			{
				if(oct.charAt(i) == '0') continue;
				res += Integer.parseInt(oct.charAt(i)+"") * Math.pow(8, p);
			}
			System.out.println(res);
		}
		else
		{
			System.out.println("Invalid format");
		}
	}
}
