package mktclass;

public class StringReplaceMethod {

	public static void main(String[] args) {
		String input ="school123";
		String output = input.replace('o',' '); // replacing o with empty space
		System.out.println(output);
		String output1 = input.replace('o','m'); // replacing o with m
		System.out.println(output1);
		System.out.println(input.replaceAll("[a-z]", "")); // replacing alphabets with space,we can do with any character like m
		String input1 ="School123";
	    System.out.println(input1.replaceAll("[A-Z]", ""));// replacing Capital alphabets from a string.
	    System.out.println(input1.replaceAll("[0-9]", " "));
	}

}
