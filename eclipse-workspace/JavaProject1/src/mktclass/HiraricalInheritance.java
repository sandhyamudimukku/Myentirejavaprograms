package mktclass;
class parent3{
	static void add() {
		System.out.println("Addition");	
	}	
}
class child2 extends parent3 {
	 static void sub() {
		System.out.println("subtraction 2");	
	}	
}
public class HiraricalInheritance extends parent3 {
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) {
		HiraricalInheritance n1=new HiraricalInheritance();
		n1.div();
		add();
		child2 n2=new child2();
		child1 n3=new child1();
		SingleInheritance n4 =new SingleInheritance();
		n2.sub();
		n3.sub();
		n4.sub();
		
		
		
	}

}
