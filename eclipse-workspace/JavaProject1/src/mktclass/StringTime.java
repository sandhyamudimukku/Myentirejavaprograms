package mktclass;

import java.util.Date;

public class StringTime {

	public static void main(String[] args) {
	Date d1=new Date();
	System.out.println(d1);
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime()+(60*60*1000*24*1));
	Date d3=new Date(d1.getTime()-(60*60*1000*24*2));
	Date d4=new Date(d1.getTime()+(60*60*1000*48*1));// 2 days 
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
	
	}

}
