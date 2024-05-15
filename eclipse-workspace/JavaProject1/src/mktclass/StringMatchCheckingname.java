package mktclass;

import java.util.Arrays;

public class StringMatchCheckingname {

	public static void main(String[] args) {
		String name="Sandhya";
		System.out.println(name.matches("S(.*)"));
		System.out.println(name.matches("(.*)y"));
		System.out.println(name.matches("......"));
		System.out.println(name.lastIndexOf('d')); // doubt for index of char & string getting same output
		System.out.println(name.repeat(5));
		String name1= "My name is sandhya";
		//String [] name2= name1.split(" ");
		//System.out.println(Arrays.toString(name2));
		System.out.println(Arrays.toString(name1.split(" ")));
		
	}

}
