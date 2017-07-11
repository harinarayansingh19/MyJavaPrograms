class Test
{
	static int a;
	int b;
	public static void main(String [] ar)
	{
		Test t1 = new Test();
		Test t2  = new Test();
	
		System.out.println("No of object of class = "+a);
	}
	public Test()
	{
		++a;
		++b;
		System.out.println("value of a " + a);
		System.out.println("value of b " + b);
	}
}