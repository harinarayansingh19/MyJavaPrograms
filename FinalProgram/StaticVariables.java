class Test
{
	static int a = 88;
	int b;
	
	public static void main(String [] ar)
	{
		Test t1 = new Test();
		t1.m1();
		t1.m2();
 	}
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m2()
	{
		System.out.println(a);
		//System.out.println(b);
	}
}