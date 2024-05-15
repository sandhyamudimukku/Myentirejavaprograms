package mktclass;

public class SIBandIIB {
	{
		System.out.println("Instance block");
	}
	static
	{
		System.out.println("static instance block");
	}
	{
		System.out.println("instance block1");
	}
	SIBandIIB()
	{
		System.out.println("constructor");
	}
	public static void main(String[]args) 
	{
		System.out.println("main method");
		SIBandIIB c1=new SIBandIIB();
	}	
}