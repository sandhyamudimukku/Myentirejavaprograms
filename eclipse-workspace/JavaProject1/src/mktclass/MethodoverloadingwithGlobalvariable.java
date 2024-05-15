package mktclass;

public class MethodoverloadingwithGlobalvariable {
	int a=10;
	int b=20;
	int c=30;
	String d="NAME";
	void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		MethodoverloadingwithGlobalvariable a2= new MethodoverloadingwithGlobalvariable();
		
		System.out.println(a2.a-a2.b);
	}
	static void mul()
	{
		MethodoverloadingwithGlobalvariable a3= new MethodoverloadingwithGlobalvariable();
		int a4 = a3.a;
		int b4 =a3.b;
		System.out.println(a4*b4);
	}
	void div()
	{
		a = 25;
		b=5;
		System.out.println(a/b);
	}
	void mod()
	{
		a = 21;
		b=4;
		System.out.println(a%b);
	}
	void name()
	{
		System.out.println(d);
		d="sandhya";
		System.out.println(d);
	}
	static void name(int a,int b,int c,String d)
	{
		MethodoverloadingwithGlobalvariable B1 = new MethodoverloadingwithGlobalvariable();
		
		System.out.println( "This will print name as "+a+b+c
				+B1.d);
		
	}
	
	public static void main(String[]args)
	{
		MethodoverloadingwithGlobalvariable a1= new MethodoverloadingwithGlobalvariable();
		a1.add();
		sub();
		mul();
		a1.div();
		a1.mod();
		a1.name();
		name(1,2,3,"Sandy");
	
	
	}
	}