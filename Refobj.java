class A1
{
	public static void main(String [] ar)
	{
		A1 a = new A1();
		a.sum(a);
		A2 ab = new A2();
		a.sum(ab);
	}
	void sum(A1  a)
	{
		System.out.println("Im super class");
	}
		
	
}
class A2 extends A1
{
	
}