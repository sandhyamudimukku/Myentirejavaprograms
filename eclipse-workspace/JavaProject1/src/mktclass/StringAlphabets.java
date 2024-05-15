package mktclass;

import java.util.Arrays;

public class StringAlphabets {
	static int NumberofAlphabets;
	public static void main(String[] args) {
		String name="sandhya123";
		char[] c1= name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
						
		if(b1==true)
		{
			NumberofAlphabets++;
		}
		
		}
		System.out.println("Number of Alphabets are "+ NumberofAlphabets);
		System.out.println(c1.length);
	}

}
