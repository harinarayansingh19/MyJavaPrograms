class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.show(12);
		t.show((byte)66);
		t.show((short)16);			//if actual parameter is not avialbethen the super type of argument avialbe then it'll call that
		t.show(92L);
	}
	void show(long a)
	{
		System.out.println("long "+a);
	}
}