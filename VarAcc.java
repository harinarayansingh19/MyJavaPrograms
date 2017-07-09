class Variable1
{
	static int a=89;
	int b=800;
	public static void main(String [] ar)
	{
		Variable1 v = new Variable1();
		v.m1();
		v.m2();
		
	}
	static void m1()
	{
		System.out.println(a);
		//System.out.println(b);
		Variable1 v1 = new Variable1();
		System.out.println(v1.b);
		v1.m2();

	}
	void m2()
	{
		System.out.println(a);
		//System.out.println(b);
	}
}