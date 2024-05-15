package mktclass;

public class FinallyKeyword_TryAndCatch {

	public static void main(String[] args) {
		try {
		int a=1/0;
		}
		catch(ArithmeticException c1)
		{
			System.out.println("Catch block executed");			
		}
		finally
		{
			System.out.println("This is finally block");
		}

	}

}
