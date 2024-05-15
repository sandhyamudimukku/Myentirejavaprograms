package mktclass;

public class Globalvariableaddsubmuldivmod
{ static int a=10;
    int b=15;
    void add()
    {
    	System.out.println(a+b);
    }
    void mul()
    {
    	System.out.println(a*b);
    }
    void div()
    {
    	System.out.println(a/b);
    }
    void sub()
    {
    	System.out.println(a-b);
    }
    void mod()
    {
    	System.out.println(a%b);
    }
    
   	public static void main(String[] args) {
   		Globalvariableaddsubmuldivmod n1 =new Globalvariableaddsubmuldivmod();
   		n1.add();
   		n1.mul();
   		n1.div();
   		n1.sub();
   		n1.mod();
   				
	}

}
