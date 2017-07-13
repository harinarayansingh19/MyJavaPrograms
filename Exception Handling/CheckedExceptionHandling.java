import java.io.*;
class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		//t.m1();
		t.m3();
	}
		
	void m1()
	{
		try
		{
			System.out.println("m1 method begin");
		//int a = 10/0;
			throw new IOException("IOException");
		}
		catch(Exception e)
		{
			System.out.println("exceptio caught");
		}
		
		
		
		
	}
	void m2()
	{
		System.out.println("m2 method begin");
		m1();
		System.out.println("m2 method end");
	}
	void m3()
	{
		System.out.println("m3 method begin");
		m2();
		System.out.println("m3 method end");
	}
}