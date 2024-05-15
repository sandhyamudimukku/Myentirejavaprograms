package mktclass;
 class CTP
 {
	  void add()
	 {
		 int a=10;
		 int b=20;
		 System.out.println(a+b);
	 }
	 void add(int a,double b)
	 {
		 System.out.println(a+b);
	 }
	 void add(int a,double b,String c)
	 {
		 System.out.println(a+b+c);
	 }
 }
public class MethodOverLoading_CTP extends CTP {	
	 void sub()
	 {
		 int a=10;
		 int b=5;
		 System.out.println(a-b);
	 }
	
	public static void main(String[] args) 
	{
		MethodOverLoading_CTP n1=new MethodOverLoading_CTP();
		n1.add();
		n1.add(10,10.256);
		n1.add(10,10.256," sandhya");
		n1.sub();
		
	}

}
