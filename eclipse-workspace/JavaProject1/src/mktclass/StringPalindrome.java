package mktclass;

public class StringPalindrome {

	public static void main(String[] args) {
		String input ="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
			
		}
	System.out.println(output);
	if(input.equals(output)==true)
	{
		System.out.println("Given string is palindrome");
	}
	else
	{
		System.out.println("Given string is not a palindrome");
	}
	}
	

}
