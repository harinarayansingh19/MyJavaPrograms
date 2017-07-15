class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.m();
		
		
	}
	void m()
	{
		final int a=90;
		//a=66;				// cant change final value
		
		final int roll;
		roll = 100;
		//roll = 101;			//already assigned
		
	}
}