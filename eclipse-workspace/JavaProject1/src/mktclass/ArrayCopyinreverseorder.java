package mktclass;

import java.util.Arrays;

public class ArrayCopyinreverseorder {

	public static void main(String[] args) {
	String [] a1 =new String[4];
		a1[0]="Sandhya1";
	a1[1]="Sandhya2";
	a1[2]="Sandhya3";
	a1[3]="Sandhya4";
	System.out.println(Arrays.toString(a1));	
	String a2[]=new String[4];
	for(int i=0;i<4;i++)
	{
		a2[i]=a1[a1.length-1-i];
	}
	System.out.println(Arrays.toString(a2));

	}

}
