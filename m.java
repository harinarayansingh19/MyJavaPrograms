class Method1
{
	public static void main(String [] ar)
	{
		Method1 m = new Method1();
		int b = 87;
		
		m.sum(b);
		m.sum(b);
	}
	
	int sum(int a)
	{
		System.out.println("int" + a);
	
	}
	long sum(int b)
	{
		System.out.println("long" + b);
	}
	
}