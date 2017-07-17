abstract class A
{
	abstract void m();
	
	public A()
	{
		System.out.println("constructor");
	}
	
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("instan block");
	}
}

 class B extends A
{
	void m(){
		System.out.println("hello");
	}
	
}
class Test
{
	public static void main(String [] ar)
	{
		B b = new B();
		b.m();
	}
}