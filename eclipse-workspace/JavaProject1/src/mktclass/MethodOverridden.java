package mktclass;
 class parent4
{
	 void add()
	{ System.out.println("Addition");
	}
	/*  void mul()
		{ System.out.println("mul");
		}*/
}	
public class MethodOverridden extends parent4
{
	void add()
	{	
		System.out.println("subtraction");
		super.add();
		
	}
	/*void mul()
	{ System.out.println("multiplication");
	super.mul();
	}*/
	public static void main(String[] args)
	{
		MethodOverridden n1 = new MethodOverridden();
		n1.add();
		//n1.mul();
		//parent4 n2=new parent4();
		//n2.add();
	}

}
