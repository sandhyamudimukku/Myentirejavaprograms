package mktclass;

public class ArrayAverage {
	static double sum=0;
	static double sum1=0;
	static double average=0;
	static double remainder=0;
	public static void main(String[] args) {
		int[] a1=new int[4];
		a1[0]=41;
		a1[1]=42;
		a1[2]=46;
		a1[3]=44;
		double[] a2=new double[4];
		a2[0]=41.0;
		a2[1]=42.1;
		a2[2]=46.2;
		a2[3]=44.3;
		for(int i=0;i<a1.length;i++)
		{
		sum=sum+a1[i];
		
		}
		for(int j=0;j<a2.length;j++)
		{
		sum1=sum1+a2[j];
		
		}
		average=(sum+sum1)/(a1.length+a2.length);
		remainder=(sum+sum1)%(a1.length+a2.length);		
	System.out.println("Average is "+ average);	
	System.out.println("remainder is "+ remainder);		
	}      
	}

