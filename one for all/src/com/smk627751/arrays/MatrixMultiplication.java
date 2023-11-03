package com.smk627751.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static int[][] getMatrix(int m,int n)
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[m][n];
		System.out.println("Enter all "+m*n+" elements: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter an element: ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public static int[][] multiply(int[][] a, int[][] b)
	{
		int [][] c = new int[a.length][b[0].length];
		for(int i = 0; i < a.length ;i++)
		{
			for(int j = 0; j < b[0].length ; j++)
			{
				for(int k = 0; k < b.length; k++)
				{
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m1: ");
		int m1 = sc.nextInt();
		System.out.println("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter m2: ");
		int m2 = sc.nextInt();
		System.out.println("Enter n2: ");
		int n2 = sc.nextInt();
		if(n1 != m2)
		{
			throw new Exception("Multiplication Not possible");
		}
		int[][] a = getMatrix(m1,n1);
		int [][] b = getMatrix(m2,n2);
		int[][] c = multiply(a,b);
		
		for( int[] d: c)
		{
			System.out.println(Arrays.toString(d));
		}
	}

}
