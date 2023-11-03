package com;



import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Home {
	public static String[] getDirectories(String packagePath)
	{
		File directory = new File(packagePath);
		String[] directories = directory.list();
		
		return directories;
	}
	
	public static void printMenu(String title, String[] directories)
	{
		String heading = "";
		title = title.toUpperCase();
		for(int i = 0; i<title.length(); i++)
		{
			heading += title.charAt(i)+" ";
		}
		int index = 1;
		int width = -25;
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("|%2s %s %-2s|\n"," ",heading," ");
		System.out.println("-------------------------------");
		for(String dir: directories)
		{
//			if(dir.equals("Home.java")) continue;
			if(dir.endsWith(".java"))
			{
				dir = dir.substring(0,dir.length()-5);
			}
			System.out.printf("|%2d| %"+(width)+"s|\n",index++,dir);
		}
		System.out.println("-------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		do {
			String title = "One For All";
			String packageName = "com.smk627751";
			String packagePath = "src/com/smk627751";
			String[] directories = getDirectories(packagePath);
			printMenu(title,directories);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			if(choice-1 >= directories.length)
			{
				System.out.println("Invalid choice");
				continue;
			}
			if(choice == 0)
			{
				break;
			}
			while(choice != 0)
			{
				String[] subDirectories = getDirectories(packagePath+"/"+directories[choice-1]);
				printMenu(directories[choice-1],subDirectories);
				System.out.print("Enter your choice: ");
				int innerChoice = sc.nextInt();
				if(innerChoice-1 >= subDirectories.length)
				{
					System.out.println("Invalid choice");
					continue;
				}
				if(innerChoice == 0) break;
				Class<?> cls = Class.forName(packageName+"."+directories[choice-1]+"."+subDirectories[innerChoice-1].substring(0,subDirectories[innerChoice-1].length()-5));
				Method method = cls.getDeclaredMethod("main", String[].class);
				String[] arguments = new String[1];
				method.invoke(null, arguments);
//				System.out.println(Arrays.toString(subDirectories));
			}
//			System.out.println(Arrays.toString(directories));
		}while(true);
		System.out.println("Exited..");
	}
}
