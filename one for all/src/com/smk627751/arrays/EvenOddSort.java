package com.smk627751.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSort {

	public static int[] sort(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int min = arr[i];
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}
	public static int[] rearrangeEvenOdd(int[] arr)
	{
		int index = arr.length-1;
		int end = 0;
		if(arr.length % 2 == 0)
		{
			end++;
			index--;
		}
		for(int i = 0;i<arr.length/2;i++)
		{
//			System.out.println("input: "+Arrays.toString(arr));
			int temp = arr[0];
//			System.out.println("hold: "+ temp);
			for(int j = 1;j<arr.length-(i*2)-end;j++)
			{
				arr[j-1] = arr[j];
			}
			arr[index] = temp;
			index -= 2;
//			System.out.println("output: "+ Arrays.toString(arr));
		}
		
		return arr;
	}
	
	public static int[] getArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the "+size+" elements: ");
		for(int i = 0;i < size;i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = rearrangeEvenOdd(sort(getArray()));
		System.out.println(Arrays.toString(arr));
	}

}
