class Test
{
	int a;
	public Test()
	{
		System.out.println("Default constructor");
	}
	
	public Test(int a)
	{
		this();
		System.out.println("Parametrise constructor");
		this.a = a;
		//this();				//must be in first statement while calling constructor
	}
	
	public static void main(String [] ar)
	{
		Test t = new Test(5);
		Test t1 = new Test();
	}
	
	
}	