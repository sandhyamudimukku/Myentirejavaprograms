package mktclass;

public class Type_Casting_BytetolongAndViseVersa {

	public static void main(String[] args) {
		byte a1=85;
		long a2 =a1; // widening type casting
		a2=1000;  // updating long value to 1000
		System.out.println(a2); 
		byte a3 = (byte) a2;
		System.out.println(a3);
		int b1=10;
		float b2= b1; // converting int to float
		System.out.println(b2);
		int b3= (int) b2; // converting float to int
		System.out.println(b3);
		

	}

}