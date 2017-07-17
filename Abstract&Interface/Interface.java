interface i1
{
	int a=90;
	void sum();
	
	/*public i1()
	{
		System.out.println("constructor");
	}
	
	static
	{
		System.out.println("static");
	}
	
	{
		System.out.println("instance");
	}*/
	
}
interface i2
{
	void sum();
}
interface i3 extends i1,i2
{
	void add();
	
}

class Test implements i3
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.sum();
		t.add();
		//a=77;	final
	}
	public void sum()
	{
		System.out.println("sum");
	}
	public void add()
	{
		System.out.println("add");
	}
}