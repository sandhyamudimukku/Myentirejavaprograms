package mktclass;
class concreteclass1
{
	 void login()
	{
		System.out.println("Login page");
	}
	static void password()
	{	System.out.println("password page");	
	}
}
abstract class flipkart extends concreteclass1
{
	abstract void signin();
	{
	}
	abstract void signup();
	{		
	}
	static void fasionpage()
	{		
	}
	void mobilepage()
	{		
	}
}
public class AbstractClass extends flipkart {
	static void groceries()
	{		
	}
	static void homefurniture()
	{		
	}
	public static void main(String[] args)
	{	AbstractClass n1=new AbstractClass();
	   n1.signin();
	   n1.login();
	   n1.signup();
	}
	@Override
	void signin() {
		System.out.println("1st abstract method");
		
	}
	@Override
	void signup() {
		System.out.println("2nd abstract method");
		
	}

}
