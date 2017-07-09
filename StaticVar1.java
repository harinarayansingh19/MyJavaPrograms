class Test
{
	static int a=28;
	int b=98;
	public static void main(String [] ar)
	{
		Test t1 = new Test();
		t1.m2();
		System.out.println(Test.a);
		Test t=null;
		System.out.println(t.a);
		
	}
	
	void m1()
	{	
		System.out.println(a);
		
	}
	
	static void m2()
	{
		Test t = new Test();
		
		System.out.println(t.b);
		t.m1();
		//gives error
	}
	
}