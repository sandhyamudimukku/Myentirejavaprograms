package mktclass;
class Grandparent
{ Grandparent(int a) // parameterized constructor 
	{
	System.out.println("This is my Grandparent parameterized constructor");
	}	
}

class parentconstructor extends Grandparent
{
	parentconstructor()
	{
		super(10); // as Grandparent is parameterized constructor we have write super keyword explicitly with parameters
		System.out.println("This is my parent constructor ");
	}
}
public class SuperClassInConstructor extends parentconstructor
{
	SuperClassInConstructor()
	{
		System.out.println("This is my child constructor"); // Super classing method is implicitly calling
	}
	SuperClassInConstructor(int a,int b) // constructor over loading
	{
		super(); // implicitly calling super calling statement though it does not require.
		System.out.println("This is my child constructor1"); // Super classing method is implicitly calling
	}
	public static void main(String[] args) {
		new SuperClassInConstructor();
		new SuperClassInConstructor(10,11);
	}

}
