package mktclass;

import java.util.Scanner;

public class ScannerCallingAllMethods {
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		s1.next();
		//s1.nextInt();
		//int s2=s1.nextInt();
		/*byte s3 = s1.nextByte();
		short s4 =s1.nextShort();
		Float s5=s1.nextFloat();
		Double s6= s1.nextDouble();*/
		Boolean s7 = s1.nextBoolean();
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		//System.out.println(s5);
		//System.out.println(s6);
		System.out.println(s7);
		s1.close();
		

	}

}
