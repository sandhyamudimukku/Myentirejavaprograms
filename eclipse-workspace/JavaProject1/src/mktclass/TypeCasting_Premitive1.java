package mktclass;

public class TypeCasting_Premitive1 {

	public static void main(String[] args) {
		double a=90; 
		System.out.println(a); 
		int ag1=92;
		double age2=ag1; //Implicitly converting the int into double, widining
		int age3= (int) age2; // converting double data type to int data type, narrowing
		System.out.println(age2); 
		System.out.println(age3); 
		
		

	}

}
