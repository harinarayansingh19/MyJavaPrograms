class Test
{
	public static void main(String [] ar)
	{
		A a1 = new A();
		A a2 = new A();
	}
}
class A
{
	static 													// run only once 
	{
		System.out.println("this is static block");
	}
	
	//instance block										//no of object times
	{
		System.out.println("this is instance block");
	}
	
	//Constructor
	public A()
	{
		System.out.println("this is Constructor");
	}
}