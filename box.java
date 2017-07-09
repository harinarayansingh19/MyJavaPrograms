class Boxing
{
	public static void main(String [] ar)
	{
		Boxing b = new Boxing();
		byte c = 66;
		b.sum(c);
		int d=89;
		b.sum(d);
	}
	void sum(Integer a)
	{
		System.out.println("Integer wrapper class" );
	}
	void sum(Number n)
	{
		System.out.println("number  class" );
	}
}