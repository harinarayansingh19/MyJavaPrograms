class Test5
{
	static int a;
	int b;
	public static void main(String [] ar)
	{
		Test5 t = new Test5();
		Test5 t1  = new Test5();
	
		System.out.println("No of object of class = "+a);
	}
	public Test5()
	{
		++a;
		++b;
		System.out.println("value of a " + a);
		System.out.println("value of b " + b);
	}
}