class Test
{
	//final static int a;				// must initialize. we cant reinitilize in constructor
	final static int a=88;
	final static int b;
	static
	{
		b = 90;
	}
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.m();
	}
	static void m()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
}

