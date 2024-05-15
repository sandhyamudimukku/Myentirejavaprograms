package mktclass;

class parent{
	static void add()
	{
		System.out.println("Addition");
		
	}
	
}

public class InheritanceClass extends parent
{
static void sub()
{
	System.out.println("subtraction");
}

	
	public static void main(String[] args) {
		add();
		sub();
		//add();
		//InheritanceClass n2= new InheritanceClass()
		

	}

}
