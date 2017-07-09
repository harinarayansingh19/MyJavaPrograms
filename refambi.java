class AA1
{
	public static void main(String [] ar)
	{
		AA1 a = new AA1();
		a.sum(null);
		AA2 ab = new AA2();
		a.sum(ab);
	}
	void sum(AA1  a)
	{
		System.out.println("Im super class");
	}
	void sum(Object o)
	{
		System.out.println("Im object class");
	}
	void sum(String s)
	{
		System.out.println("Im String class");
	}
	
}
class AA2 extends AA1
{
	
}