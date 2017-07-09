class Widening1
{
	public static void main(String [] ar)
	{
		Widening1 w = new Widening1();
		byte a = 67;
		w.sum(a);
		int b=788;
		w.sum(b);
		w.sum(5.2f);
	}
	void sum(float a)
	{
		System.out.println("float" );
	}
	void sum(short b)
	{
		System.out.println("short");
	}
	void sum(long c)
	{
		System.out.println("long" );
	}
}