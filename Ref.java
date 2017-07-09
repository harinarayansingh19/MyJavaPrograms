class Test
{
	int a;
	
	public static void main(String [] ar)
	{
		Test t1 = new Test();
		System.out.println(t1.a);
		t1.a=77;
		System.out.println(t1.a);
		Test t2= t1;
		System.out.println(t2.a);
		t2.a=88;
		System.out.println(t1.a);
		System.out.println(t2.a);
	}
}