import java.io.*;
class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		//t.m1();
		t.m3();
	}
		
	void m1() throws IOException //RuntimeException		//u can write
	{
		System.out.println("m1 method begin");
		throw new IOException("IOException");
		
	}
	
	void m2() throws Exception
	{
		System.out.println("m2 method begin");
		m1();
		System.out.println("m2 method end");
	}
	void m3()
	{
		System.out.println("m3 method begin");
		try
		{
			m2();
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		System.out.println("m3 method end");
	}
}