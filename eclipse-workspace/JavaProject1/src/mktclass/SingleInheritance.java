package mktclass;
class parent1
{
	static int a;
	static int b;
	 void add()
	{
		 //int a=10;
		 
		System.out.println("This is super class");
		System.out.println("Addition "+(a+b));
	}
}


public class SingleInheritance extends parent1 {
	static void sub()
	{
		System.out.println("This is sub class");
			//System.out.println("subtraction "+ (a-b));
	}

	public static void main(String[] args) {
		a=10;
		a=11;
		
		SingleInheritance c1= new SingleInheritance();
		c1.add();
		b=10;
		sub();
		
		

	}

}
