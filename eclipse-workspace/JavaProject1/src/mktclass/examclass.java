package mktclass;

public class examclass {

	public static void main(String[] args) {
		String a1="Sandhya   ";
		a1.length();
		a1.charAt(0);
		a1.indexOf('s');
		a1.toUpperCase();
		a1.toLowerCase();
		a1.trim();
		//
		a1.substring(2);
		
		//System.out.println(a1.substring(2));
		int a2[]= new int[4];
	 a2[0]=10;
	 a2[1]=20;
	 a2[2]=30;
	 a2[3]=40;
	 int sum=0;
	 
	 for(int i=0;i<4;i++)
	 {
		 sum=sum+a2[i];
	 }
	System.out.println(sum);
	
	}

}
