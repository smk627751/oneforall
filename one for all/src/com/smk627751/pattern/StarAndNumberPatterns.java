package com.smk627751.pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Pattern{
	
	void invertedHollowRightTriangle(int n)
	{
		System.out.println("Inverted hollow right triangle: ");
		for(int i = 0;i<n;i++)
		{
			for(int k = 0;k<n;k++)
			{
				if(i == 0)
				{
					System.out.print("*");
				}
				else if(k == i || k == n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	void invertedHollowLeftTriangle(int n)
	{
		System.out.println("Inverted hollow left triangle: ");
		for(int i = 0;i<n;i++)
		{
			for(int k = i;k<n;k++)
			{
				if(i == 0)
				{
					System.out.print("*");
				}
				else if(k == i || k == n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	void invertedHollowTriangle(int n)
	{
		System.out.println("Inverted hollow triangle: ");
		int len = 2*n-1;
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k = i;k<2*n-1;k++)
			{
				if(i == 0)
				{
					System.out.print("*");
				}
				else if(k == i || k == len-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			len--;
			System.out.println();
		}
	}
	
	void hollowTriangle(int n)
	{
		System.out.println("Hollow triangle:");
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=2*i;k++)
			{
				
				if(i == n-1)
				{
					System.out.print("*");
				}
				else if(k == 0 || k == 2*i)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	void hollowRightRhombus(int n)
	{
		System.out.println("Hollow Right Rhombus: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n;k++)
			{
				if(i == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else if(k == 0 || k ==n-1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	void hollowLeftRhombus(int n)
	{
		System.out.println("Hollow Left Rhombus: ");
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n;k++)
			{
				if(i == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else if(k == 0 || k ==n-1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	void hollowRightArrow(int n)
	{
		System.out.println("Hollow right arrow: ");
		int start = 0;
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0 || j == start)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i < n-1)
			{
				start++;
			}
			else
			{
				start--;
			}
			System.out.println();
		}
	}
	
	void hollowLeftArrow(int n)
	{
		System.out.println("Hollow Left Arrow: ");
		int end = n-1;
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==n-1 || j == end)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i >= n-1)
			{
				end++;
			}
			else
			{
				end--;
			}
			System.out.println();
		}
	}
	
	void hollowDiamond(int n)
	{
		int start = n-1,end=n-1;
		System.out.println("Hollow Diamond");
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<=2*n-1;j++)
			{
				if(j == start || j == end)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			if(i < n-1)
			{
				start--;
				end++;
			}
			else
			{
				start++;
				end--;
			}
			System.out.println();
		}
	}
	
	void hollowDiamondInRhombus(int n)
	{
		int start = n-1,end=n-1;
		System.out.println("Hollow Diamond in rhombus: ");
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<=2*n-1;j++)
			{
				if(j > start && j <= end)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			if(i < n-1)
			{
				start--;
				end++;
			}
			else
			{
				start++;
				end--;
			}
			System.out.println();
		}
	}
	
	void rectangle(int n)
	{
		System.out.println("Rectangle: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void hollowRectangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else if(j==0 || j == n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	void hourGlass(int n)
	{
		System.out.println("Hour glass: ");
		int end = 2*n-2;
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				if(i == 0 || i == 2*n-2)
				{
					if(j%2 == 0)
					System.out.print("* ");
				}
				else if(j==i || j==end)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			end--;
			System.out.println();
		}
	}
	
	void rotatedHourGlass(int n)
	{
		System.out.println("Rotated hour glass: ");
		int start =0, end = 2*n-2;
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<2*n;j++)
			{
				if(j <= start || j > end)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i < n-1)
			{
				start++;
				end--;
			}
			else
			{
				start--;
				end++;
			}
			System.out.println();
		}
	}
	
	void pyramid1to9(int n)
	{
		System.out.println("Pyramid1to9: ");
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=i;j<2*n-2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}
	
	void pyramid9to1(int n)
	{
		System.out.println("Pyramid9to1: ");
		int num = 2*n-1;
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<2*n-1;j++)
			{
				System.out.print(num+" ");
			}
			num--;
			System.out.println();
		}
	}
	
	void invertedPyramid(int n)
	{
		System.out.println("Inverted pyramid: ");
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<2*n-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void pyramid(int n)
	{
		System.out.println("Pyramid: ");
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=i;j<2*n-2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void pyramid1to9InRows(int n)
	{
		System.out.println("Pyramid1to9 in rows: ");
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=i;j<2*n-2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
	
	void evenPyramid(int n)
	{
		System.out.println("Even pyramid");
		int num = 1;
		for(int i=0;i<2*n-1;i++)
		{
			int dec = 0;
			for(int j=i;j<2*n-2;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(j+1+" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(num-dec+" ");
				dec++;
			}
			num++;
			System.out.println();
		}
	}
	
	void reversedEvenPyramid(int n)
	{
		System.out.println("Reversed even triangle: ");
		int num = 2*n-1;
		int inc = 2*n-1;
		for(int i=0;i<2*n-1;i++)
		{
			int dec = 0;
			for(int j=i;j<2*n-2;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(inc+j+" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(num-dec+" ");
				dec++;
			}
			inc--;
			System.out.println();
		}
	}
}

public class StarAndNumberPatterns {
	class Sort implements Comparator<Method>
	{

		@Override
		public int compare(Method o1, Method o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		do
		{			
			Pattern p = new Pattern();
			Method[] methods = p.getClass().getDeclaredMethods();
			Arrays.sort(methods,new StarAndNumberPatterns().new Sort());
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("|          P A T T E R N S         |");
			System.out.println("------------------------------------");
			for(int i = 0,index = 1; i < methods.length; i++)
			{
				System.out.printf("|%2d| %-30s|\n", i+1, methods[i].getName());
			}
			System.out.printf("|%2d| %-30s|\n",0,"exit");
			System.out.println("------------------------------------");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println();
//			System.out.print(Arrays.toString(methods));
			if(choice == 0)
			{
				break;
			}
			else if(choice > methods.length)
			{
				System.out.println("Invalid choice");
			}
			else
			{
				System.out.print("Enter a size: ");
				methods[choice-1].invoke(p, sc.nextInt());
			}
			System.out.println();
		}while(true);
		System.out.println("Exited..");
	}

}
