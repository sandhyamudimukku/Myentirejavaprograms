package mktclass;
 public class ThisCallingForConstructor  
{
	 ThisCallingForConstructor()
	 {
		System.out.println("This is 1st constructor");
		
	 }
	 ThisCallingForConstructor(int a,int b)
	 {
		System.out.println("This is 1st parameterized constructor");
		
	 }
	 ThisCallingForConstructor(int a,int b,char c, String d)
	 {
		System.out.println("Name of the person is "+(a+b)+" "+c+" "+d);
		
	 }
	 ThisCallingForConstructor(float t,double d)
	 {
		System.out.println("This is 1st parameterized constructor");
		
	 }
	 ThisCallingForConstructor(char t)
	 	 {    this(0.1f,0.200);
		System.out.println("This is 2nd parameterized constructor using this calling");
		
	}
	 ThisCallingForConstructor(String d)
	 {
		this('s');
		 System.out.println("Name of the person is " + d);
		
	 }
	 
	 public static void main(String[] args) {
		 new ThisCallingForConstructor();
		new ThisCallingForConstructor(10,10);
		new ThisCallingForConstructor(20,30,'M', "Sandhya");
		new ThisCallingForConstructor("sandhya");
		
	 }
	 }
	 
	