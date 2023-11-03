package com.smk627751.numberconversions;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int num = sc.nextInt();
		String res = "";
		while(num > 0)
		{
			res = num % 2 + res;
			num = num / 2;
		}
		
		System.out.println(res);
	}

}
