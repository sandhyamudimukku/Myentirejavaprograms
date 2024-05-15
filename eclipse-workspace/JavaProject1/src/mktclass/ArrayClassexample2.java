package mktclass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassexample2 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String name[] = new String[2];
		for(int i=0;i<2;i++)
		{   
			System.out.println("enter the value of name " + i);
			name[i]=s1.next();
		}
		System.out.println(Arrays.toString(name));
		int rollno1[]=new int[2];
		for(int i=0;i<rollno1.length;i++)
		{		
			System.out.println("enter the value of rollno1");
		    rollno1[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno1));
		System.out.println("Name"+"      "+ "RollNumbers");
	   for(int i=0;i<2;i++)
	   {
		   System.out.println(name[i]+" "+rollno1[i]);
	   }
	}
	
	
	
          

}

