package mktclass;

public class Constructor {
	Constructor()
	{
		System.out.println("Non parameterized");
	}
	Constructor(int a,char c,double d,String e,boolean f,float g)
	{
		System.out.println("Parameterized constructor");
	}
	
	static void sub()
	{
		System.out.println("Static method");
	}
	
	void add()
	{
		System.out.println("Non Static method");
	}
	public static void main(String[] args)
	{
		System.out.println("Main method");
		Constructor a = new Constructor();
		new Constructor(1255,'a',0.12345,"sandy",true,0.01f);
		sub();
		a.add();
		SingleInheritance n4 =new SingleInheritance();
		n4.sub();
		

	}
	}
