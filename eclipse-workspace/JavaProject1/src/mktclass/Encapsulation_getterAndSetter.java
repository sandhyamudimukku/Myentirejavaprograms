package mktclass;
public class Encapsulation_getterAndSetter 
{
	private String un="sandhya.mudimukku@gmail.com";// for non static we have to use setter & getter, for sttaic variable either we can directly access or we can go by getter & setter
	private int roll=12;
	private double marks=10.12;	
	public String getun()
	{
		return un;
	}
	public void setun(String un)
	{
		this.un=un;
	}
	public int getroll()
	{
		return roll;
	}
	public void setroll(int roll)
	{
		this.roll=roll;
	}
	public double getmarks()
	{
		return marks;
	}
	public void setmarks(double marks)
	{
		this.marks=marks;
	}

	public static void main(String[] args) {
		Encapsulation_getterAndSetter a1=new Encapsulation_getterAndSetter();
		a1.setun("mudimukku.sandhya@gmail.com");
		a1.setroll(16);
		a1.setmarks(18.85);
		System.out.println(a1.getun());
	    System.out.println(a1.getroll());
	    System.out.println(a1.getmarks());
	}
	}
