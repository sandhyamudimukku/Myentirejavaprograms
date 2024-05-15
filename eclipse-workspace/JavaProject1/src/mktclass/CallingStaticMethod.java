package mktclass;

public class CallingStaticMethod {

	      
		
			static void addition()
			{
				System.out.println("Addition");
			}
			
			void subtraction()
			{
				System.out.println(3-2);
				
			}
			
			void Multiplication(int b)
			{
				System.out.println("Multiplication is" + " " + 3*2);
				
			}
			
			public static void main(String[] args) 
			{
				System.out.println("Main Method");
				CallingStaticMethod a = new CallingStaticMethod();
				a.subtraction();
				a.Multiplication(465);
				addition();
					
			

		
	
	}

}
