package mktclass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerClass {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array");		
		String []name=new String[s1.nextInt()];		
		for(int i=0;i<name.length;i++)
		{  
			System.out.println("Enter the value of the array" + i);
			name[i]=s1.next();
			//System.out.println(name[i]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println("Enter the size of the array");
		String []name1=new String[s1.nextInt()];				
		for(int i=0;i<name1.length;i++)
		{
			System.out.println("Enter the values of the second array of "+i);
			name1[i]=s1.next();		
		}
		System.out.println("Values of the second array are " +Arrays.toString(name1));
	  System.out.println(Arrays.equals(name, name1));
	  if(Arrays.equals(name,name1)==true)
	  {
		System.out.println("Values are same");  
	  }
	  else
	  {
		  System.out.println("values are different");
	  }	
	}
}
