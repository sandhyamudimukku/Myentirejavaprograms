package mktclass;
class parent2{
	static int a=20;
	static int b;
			
	static void add()
	{
		System.out.println("addition");
		System.out.println(a+b);
	}	
}
class child1 extends parent2{
	 void sub()
	{
		System.out.println("subtraction123");
		//System.out.println(a-b);
	}	
}

public class MulitilevelInheritance extends child1 {
	static void mul()
	{
		System.out.println("multiplication");
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		b=50;		
		add();
		//n1.sub();
		mul();
		SingleInheritance n4 =new SingleInheritance();
		
	}

}
