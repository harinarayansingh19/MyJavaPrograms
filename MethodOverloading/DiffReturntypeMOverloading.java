class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		//t.show(221L);
		//t.show(65);
		t.m();						//wont compile java doesnt support overloading based on return type
	}
	void show(int a)
	{
		System.out.println(a);
	}
	int show(int a)
	{
		System.out.println(a);
		return a;
		
	}
	/*long show(int a)
	{
		System.out.println(a);
		return a;
		
	}*/
	void m()
	{
		int a=5;
		show(a);
	}
}