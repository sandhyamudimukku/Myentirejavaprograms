package mktclass;

import java.util.Arrays;

public class StringtofindSpecialChars {
	static int NoofAlphabets;
	static int Totalnumbers;
	static int Totalspaces;
	static int TotalSpecialChars;
	public static void main(String[] args) {
		String n1="sandhya 123 1995 @ # $ %%%%";
		char [] c1=n1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		boolean b2=Character.isDigit(c1[i]);
		boolean b3=Character.isSpaceChar(c1[i]);
		
		if(b1==true)
		{
			NoofAlphabets++;
		}
		if(b2==true)
		{
			Totalnumbers++;
		}
		if(b3==true)
		{
			Totalspaces++;
		}	
	}
		System.out.println(NoofAlphabets); 
		System.out.println(Totalnumbers);
		System.out.println(Totalspaces);
		int n2=NoofAlphabets+Totalnumbers+Totalspaces;
		System.out.println(c1.length);
		System.out.println(c1.length-n2);
}
	}
