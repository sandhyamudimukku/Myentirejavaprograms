package mktclass;
class mainparent
{
	void add()
	{System.out.println("Addition");}
	}

public class Superkeyword extends mainparent 
{
	 void add()
	{
		 super.add();//super keyword will call the parent implementation	
		System.out.println("subtraction");
          super.add(); // we can write it in any line of the child class
		}
	public static void main(String[] args) {
		Superkeyword n1 = new Superkeyword();
		n1.add();
		
		

	}

}
