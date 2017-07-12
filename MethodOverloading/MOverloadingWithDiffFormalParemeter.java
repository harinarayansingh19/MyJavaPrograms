class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.show(12);
		t.show((byte)17);
		t.show((short)92);
		t.show(66);
	}
	void show(int a)
	{
		System.out.println("int "+a);
	}
	void show(byte a)
	{
		System.out.println("byte "+a);
	}
	void show(short a)
	{
		System.out.println("short "+a);
	}
	void show(long a)
	{
		System.out.println("long "+a);
	}
}