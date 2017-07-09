final class Parent
{
	private int a=10;
	private void m1()
	{
		System.out.println(a);
		
	}
	public void m2()
	{
		System.out.println(a);
	}
}

class Child extends Parent
{
	private int b=88;
	void m3()
	{
		//m1();					//cant access
		m2();
		//System.out.println(a);			//cant access
		System.out.println(b);
	}
}
class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		//Parent p = new Parent();
		c.m3();
		//c.m1();
		
	}

}