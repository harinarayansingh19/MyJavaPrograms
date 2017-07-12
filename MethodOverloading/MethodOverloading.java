class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		//t.show();
		t.show(65);
		t.show(2,5);
		t.show(10.5f);
		t.show(5,16.8f);
		t.show(9.6f,45);
	}
	// no of parameter
	void show(int a)
	{
		System.out.println(a);
	}
	void show(int a, int b)
	{
		System.out.println(a +"   "+b);
	}
	
	//Type of parameter
	void show(float f)
	{
		System.out.println(f);
	}
	// Sequence of parameter
	void show(int a, float b)
	{
		System.out.println(a+ "   "+b);
	}
	void show(float a, int b)
	{
		System.out.println(a +"   "+b);
	}
}