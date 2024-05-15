package mktclass;

import java.util.Arrays;

public class StringToFindNumericvalues {
	static int Totalnumber;

  public static void main(String[]args)
  {
	  String name ="sandhya1995" ;
	  char []c2 =name.toCharArray();
	  System.out.println(Arrays.toString(c2));
	  for(int i=0;i<c2.length;i++)
	  {
	  boolean b2= Character.isDigit(c2[i]);
	  	  	  
	  if(b2==true)
	  {
		  Totalnumber++;
	  }
  }
	  System.out.println(Totalnumber);
	 }}