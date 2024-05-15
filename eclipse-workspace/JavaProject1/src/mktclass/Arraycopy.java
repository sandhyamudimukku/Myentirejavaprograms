package mktclass;

import java.util.Arrays;

public class Arraycopy {

	public static void main(String[] args) {
		String [] a1= new String[4];
		a1[0]="sandhya";
		a1[1]="sandhya1";
		a1[2]="sandhya2";
		a1[3]="sandhya3";
		String []a2= new String[4];
		System.out.println(Arrays.toString(a1));		
		for(int i=0;i<4;i++)
		{
			a2[i] =a1[i];	
		
		}
		System.out.println(Arrays.toString(a2));
	}

}
