package mktclass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		 String name[] = new String[3];
				 name[0]="Sandhya";
		         name[1]="shiva";
		         name[2]="Sandy";
		 int rollNo[] = new int[3];
		         rollNo[0]=12;
		         rollNo[1]=13;
		         rollNo[2]=14;
		 char Gender[] = new char[3]; 
		         Gender[0]='F';
		         Gender[1]='M';
		         Gender[2]='F';
		  System.out.println("name " + "   rollNo "+"   Gender ");
	for(int i=0;i<3;i++)
	{
		System.out.println(name[i]+"     "+rollNo[i]+"    "+Gender[i]);
	}
	 System.out.println(Arrays.toString(name));
	 System.out.println(Arrays.toString(rollNo));	
	 System.out.println(Arrays.toString(Gender));	
	}}

	