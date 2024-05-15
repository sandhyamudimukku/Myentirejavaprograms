package mktclass;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String a1="Sandhya";
		String a2="anSydha";  // JAVA is case sensitive too
		
		if(a1.length()!=a2.length())
		{
			System.out.println("not anagram");
		}
		else {
		                            
		char[] c1 =a1.toCharArray(); // converting string to arrays as string cannot be sorted
		char[] c2 =a2.toCharArray();
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		System.out.println("After sorting");
		Arrays.sort(c1);
	    Arrays.sort(c2);
	    System.out.println(Arrays.toString(c1));
	    System.out.println(Arrays.toString(c2));
	    if(Arrays.equals(c1, c2)==true)
	    {
	    	System.out.println("This is anagram");
	    }
	    else
	    {
	    	System.out.println("This is not an anagram");
	    }
	}

}
}