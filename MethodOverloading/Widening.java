class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.sum((byte)12);		//byte running
		t.sum((short)65);
		t.sum(32);				//int   running
		t.sum(32L);
	}
	void sum(short a)
	{
		System.out.println("short");
	}
	void sum(long a)
	{
		System.out.println("long");
	}
}