class Parent
{
	private int a=78;
	private void m1()
	{
		System.out.println("accessing private var in private method m1 "+a);
	}
	public void m2()
	{
		System.out.println("accessing private var in public method m2 "+a);
	}
}
class Child extends Parent
{
	private int b=54;
	void m3()
	{
		//m1();
		m2();
		//System.out.println("accessing private var in public method m3 "+a);		//error
		System.out.println("accessing private var in public method m3 "+b);
	}
}

class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		c.m3();
		//super.m1();
		
	}

}