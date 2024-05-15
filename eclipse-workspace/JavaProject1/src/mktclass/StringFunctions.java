package mktclass;

public class StringFunctions {

	public static void main(String[] args) {
		String name= "School";
		String name1= "college";
		String name2= "   college and scholl  ";		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('c'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" ").concat(name1));
		System.out.println(name.contains("hoo"));
		System.out.println(name.contains("hol"));
		System.out.println(name2);
		System.out.println(name2.trim());

	}

}
