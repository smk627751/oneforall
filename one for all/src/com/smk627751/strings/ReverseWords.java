package com.smk627751.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWords {

	void rev(char[]s, int start, int end)
	{
		char temp;
	      for(int i=0;i<s.length;i++)
	      {
	          if(start<end)
	          {
	    	  temp = s[start];
	    	  s[start]=s[end];
	    	  s[end]=temp;
	    	  }
	          start++;
	          end--;
	      }
	}
	public static void main(String[] args) throws IOException {
	  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter a String: ");
	  String str = input.readLine();
      char s[]= new char[str.length()];
      for(int i=0;i<str.length();i++)
      {
    	  s[i]=str.charAt(i);
      }
      int start=0;
      int end = str.length()-1;
      ReverseWords a = new ReverseWords();
      a.rev(s, start, end);
      
      for(end=0;end<s.length;end++)
      {
    	  if(s[end]==' ')
    	  {
    		  a.rev(s,start,end-1);
    		  start=end+1;
    	  }
      }
      a.rev(s,start,s.length-1);
      //System.out.print(start);
      System.out.println(s);
      }
	}

