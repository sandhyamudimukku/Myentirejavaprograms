package mktclass;

public class IfelseifElse {

	public static void main(String[] args) {
		
		char Male = 'M';
		char Female = 'f';
		
		char Other = 'O';
			
		
		if ( Male == 'f' )
		{
			System.out.println("Price of the ticket for male is 100 rs");
			
			
		}
		else if( Female == 'f')
		{
			System.out.println("Price of the ticket for female is 50 rs");
		}
		else
		{
			System.out.println("Price of the ticket for other is 30 rs");
		}
	}

}
