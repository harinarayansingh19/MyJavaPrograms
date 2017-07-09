class Method
{
	public static void main(String [] ar)
	{
		Method m = new Method();
		m.m1(5);
		m.m2();
		m.m3();
	}
	void m1(int i)
	{
		System.out.println("method m1");
		return;
	}
	int m2()
	{
		System.out.println("method m2");
		/*void m4()
		{
			System.out.println("method m1");
		}*/
		m3();
		return (int)1.1;
		
	}
	double m3()
	{
		System.out.println("method m3");
		return 1.0;
	}
}