package mktclass;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchblock_Scannerclass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try {
		int number=s1.nextInt();		
		String[] name= new String [number];
		name[0]="rama";
		name[1]="sita";
		name[2]="shiva";
		name[3]="sandhya";		
		System.out.println(Arrays.toString(name));	
	}
catch(InputMismatchException c1 )
		{
	      System.out.println("exeception handled so catch block executed");     
		}
		catch(ArrayIndexOutOfBoundsException c2 )
		{
	      System.out.println("exeception2 handled so catch block executed");     
		}
}
}
