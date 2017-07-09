class Widening2
{
	public static void main(String [] ar)
	{
		Widening2 w = new Widening2();
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
	void sum(Integer b)
	{
		System.out.println("Integer");
	}
	void sum(long c)
	{
		System.out.println("long" );
	}
}