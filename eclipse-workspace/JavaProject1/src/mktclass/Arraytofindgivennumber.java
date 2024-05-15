package mktclass;

public class Arraytofindgivennumber {
	static int totalnumber;
	public static void main(String[] args) {
	int a1[]=new int[4];
	a1[0]=41;
	a1[1]=50;
	a1[2]=41;
	a1[3]=41;
	int a2=41;
	for(int i=0;i<4;i++)
	{
		if(a2==a1[i]==true)	
		{
			System.out.println("Numbers are same");
			totalnumber++;
		}
		else
		{
			System.out.println("Numbers are not same");
		}		
	}
	System.out.println(totalnumber);
	
}}