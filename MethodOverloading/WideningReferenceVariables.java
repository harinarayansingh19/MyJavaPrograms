class Test
{
	
}
class Test1 extends Test
{
	void show(Test t)
	{
		System.out.println("Im super class");
	}
}
class Test2
{
	public static void main(String [] ar)
	{
		Test t1 = new Test();
		Test1 t2 = new Test1();
		
		show(t);
		show(t);
	}
}