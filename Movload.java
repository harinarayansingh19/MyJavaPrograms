class Method
{
	public static void main(String [] ar)
	{
		Method m = new Method();
		long a = 90;
		m.sum(564165);
		m.sum(20.2f);
		m.sum(20);
		m.sum(555464L);
		m.sum(a);
	}
	void sum(int a)
	{
		System.out.println("int" + a);
	}
	void sum(float b)
	{
		System.out.println("float" + b);
	}
	void sum(long c)
	{
		System.out.println("long" + c);
	}
}