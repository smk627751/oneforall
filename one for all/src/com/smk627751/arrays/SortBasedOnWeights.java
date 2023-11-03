package com.smk627751.arrays;
import java.util.Scanner;

public class SortBasedOnWeights {

	public static boolean checkPerfectSquare(int num)
	{
		double sqrt = Math.sqrt((double)num);
		return sqrt - Math.floor(sqrt) == 0;
	}
	
	public static boolean checkDivisibleBy4and6(int num)
	{
		return num % 4 == 0 && num % 6 == 0;
	}
	
	public static boolean checkEven(int num)
	{
		return num % 2 == 0;
	}
	
	public static int validate(int num)
	{
		int sum = 0;
		if(checkPerfectSquare(num)) sum +=  5;
		if(checkDivisibleBy4and6(num)) sum += 4;
		if(checkEven(num)) sum += 3;
		return sum;
	}
	
	public static int[][] sort(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int max = arr[i][1];
			int maxIndex = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j][1] > max)
				{
					max = arr[j][1];
					maxIndex =j;
				}
			}
			
			int[] temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		
		return arr;
	}
	
	public static int[][] getArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int size = sc.nextInt();
		int[][] arr = new int[size][2];
		System.out.println("Enter the "+size+" elements: ");
		for(int row = 0; row < size; row++)
		{
			arr[row][0] = sc.nextInt();
			arr[row][1] = validate(arr[row][0]);
		}
//		sc.close();
		return arr;
	}
	
	public static void main(String[] args) {
		int[][] arr = sort(getArray());
		
		for(int[] a : arr)
		{
			System.out.printf("<%d,%d> ",a[0],a[1]);
		}
	}

}
