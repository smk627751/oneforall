package com.smk627751.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsAndConsonents {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String: ");
		String str = input.readLine();
		String res = "";
		
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<str.length();i++)
		{
			boolean flag = true;
			int index = 0;
			for(int j=0;j<vowels.length;j++)
			{
				if(str.charAt(i) == vowels[j])
				{
					flag = false;
					break;
				}
				
				else
				{
					flag = true;
					index = i;
				}
			}
			
			if(flag && str.charAt(i)>='A' && str.charAt(i) <= 'Z')
			{
				res += "#"+(char)(str.charAt(index)+32);
			}
			
			else if(flag && str.charAt(i)>='a' && str.charAt(i) <= 'z')
			{
				res+="#"+(char)(str.charAt(index)-32);
			}
		}
		System.out.println(res);
			
		}

	}
