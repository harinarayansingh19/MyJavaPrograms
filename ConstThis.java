
class Test{
	int a;
	int b;
	public Test()
	{
		this(4);
		System.out.println("DDefault const");
	}
	public Test(int a)
	{
		//System.out.println("bbb const");									//wont compile
		this();
		System.out.println("parametrise const");
	}
	public static void main(String [] ar)
	{
		Test t = new Test(5);		
		//System.out.println(t.a);
	}
}