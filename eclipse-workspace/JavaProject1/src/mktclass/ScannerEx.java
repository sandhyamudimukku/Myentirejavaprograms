package mktclass;

import java.util.Scanner;
public class ScannerEx {
	//static int s2;
	//static int s3;	
	static void add()
	{
	  Scanner sc1 = new Scanner(System.in);
	 int a=sc1.nextInt();
	 int b=sc1.nextInt();
	 
	 System.out.println(a+b);
	 
	 //System.out.println(s2+s3);
	 
	}
	static void sub()
	{
		Scanner sc1 = new Scanner(System.in);
		 int a=sc1.nextInt();
		 int b=sc1.nextInt();
		System.out.println(a-b);
		
		
	}
	/*static void mul()
	{
		System.out.println(s2*s3);
		
	}
	 void div()
	{
		System.out.println(s2/s3);
		
	}
	static void mod()
	{
		System.out.println(s2%s3);
		
	}*/
	public static void main(String[] args) 
	{
		/*Scanner s1=new Scanner(System.in);
		ScannerEx D1=new ScannerEx();
		s2=s1.nextInt();
		s3=s1.nextInt();*/		
		add();
		sub();
		//mul();
		//D1.div();
		//mod();
	//s1.close();
		
		
	}
	
}
