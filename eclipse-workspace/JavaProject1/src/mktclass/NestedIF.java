package mktclass;

public class NestedIF {

	public static void main(String[] args) {
		char male = 'M';
		char female = 'F';
		char other = 'O';
		char child = 'C';
		
		if (male != 'M' || female != 'F')
		{
			if(male != 'M')
			{
				System.out.println(" Price of the ticket for male is 100");
			}
			else
			{
			   System.out.println("Price of the ticket for female is 50");
			}
		}
		else if( child == 'C' && other != 'O')
		{
			System.out.println("Price of the ticket for child is 10");
		}
		else
		{
			System.out.println("Price of the ticket for other is 30");
		}
	}
	
	

}
