package mktclass;

import java.util.Arrays;

public class StringTofindSpaces {
static int Numberofspaces;	
	public static void main(String[] args) {
		String s1="Sandhya 123 1 9 9  5";
		char [] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++) {			
		boolean c2= Character.isSpaceChar(c1[i]);
			if(c2==true)
			{
				Numberofspaces++;
			}
		}
		System.out.println(Numberofspaces);
		
		
	}

}
