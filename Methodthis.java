class Test
{
	void sum(int a)

	{
		System.out.println("this is Parent class method");
		}
		
	public static void main(String [] ar)
	{
		Test2 t = new Test2();
		t.m();
		
		
	}
}
class Test2 extends Test
{
	void sum(int a)
	{
		System.out.println("this is child class method");
	}
	void m()
	{
		sum(2);
		
		this.sum(44);
		super.sum(66);
	}
	
}
	