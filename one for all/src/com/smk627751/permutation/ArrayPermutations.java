package com.smk627751.permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPermutations {
	private static void swap(int[] nums, int start, int i) {
		int temp = nums[i];
		nums[i] = nums[start];
		nums[start] = temp;
	}

	private static void permutate(int[] nums, int start, List<List<Integer>> list) {
		if(start == nums.length - 1)
		{
			List<Integer> l = new ArrayList<>();
			for(int n : nums)
			{
				l.add(n);
			}
			list.add(l);
			return;
		}
		
		for(int i = start; i < nums.length; i++)
		{
			swap(nums,start,i);
			permutate(nums,start + 1,list);
			swap(nums,start,i);
		}
	}
	
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements:");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the "+i+" element:");
			nums[i] = sc.nextInt();
		}
		permutate(nums,0,list);
		System.out.println("There are about "+list.size()+" ways");
		System.out.println(list);
	}

}

