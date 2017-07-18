class Parent
{
	final int a=10;
	final void m1()
	{
		System.out.println("final method m1 "+a);
		
	}
	public void m2()
	{
		System.out.println(a);
	}
}

class Child extends Parent
{
	final int b=88;
	void m3()
	{
		m1();					
		m2();
		System.out.println(a);			
		System.out.println(b);
	}
}
class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		
	}

}