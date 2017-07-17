class Test
{
	int a;
	public static void main(String [] ar)
	{
		Test t = new Test();
		System.out.println("in main "+t.a);			// print 0 now
		t.m(t);
		System.out.println("in main "+t.a);			// 100
	}
	
	void m(Test t)
	{
		System.out.println("method m");
		t.a = 100;
		System.out.println("in m method value of a  "+a);			//100
		
	}
}