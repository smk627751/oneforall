package com.smk627751.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberOfGrandChildren {

	public static String[][] getArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		String[][] arr = new String[size][2];
		for(int row = 0; row < size; row++)
		{
			for(int column = 0; column < 2; column++)
			{
				arr[row][column] = sc.next();
			}
		}
//		sc.close();
		return arr;
	}
	
	public static int getGrandChildren(String[][] arr, String grandParent)
	{
		ArrayList<String> parents = new ArrayList<String>();
		int grandChildren = 0;
		for(String[] a : arr)
		{
			if(a[1].equals(grandParent))
			{
				parents.add(a[0]);
			}
		}
		
		for(String parent: parents)
		{
			for(String[] a: arr)
			{
				if(a[1].equals(parent))
				{
//					System.out.print(Arrays.toString(a));
					grandChildren++;
				}
			}
		}
		
		return grandChildren;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] arr = getArray();
		String grandParent = sc.next();
		int grandChildren = getGrandChildren(arr,grandParent);
		System.out.print(grandChildren);
	}

}

