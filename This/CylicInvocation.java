class Test
{
	int a;
	public static vodi main(String [] ar)
	{
		Test t = new Test();
		Test t1 = new Test(5);

	}
	public Test()
	{
		//this();					// wont compile recursive constructor invocation
		this(5);					// wont compile
	}
	public Test(int a)
	{
		//this(5);						// wont compile
		this();							// wont compile
	}
	
	
	
}