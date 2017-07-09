class Parent
{
	final int a=10;
	final void m1()
	{
		System.out.println("final method m1 "+a);
		
	}
}
class Child extends Parent
{
	
	void m3()
	{
		m1();		
	}
}
class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		c.m3();
		c.m1();	
	}

}