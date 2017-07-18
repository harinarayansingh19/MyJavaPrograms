class Parent
{
	static void m()						
	{
		System.out.println("parent static method m ");
	}
	static void m1()
	{
		System.out.println("parent static method m1 ");
	}
}
class Child extends Parent
{
	/*void m()								// we cant override static method
	{
		System.out.println("child non-static method m ");
	}*/
	static void m1()
	{
		System.out.println("child static method m1 ");
	}
}

class Test
{
	public static void main(String [] ar)
	{
		Parent p = new Parent();
		Child c = new Child();
		c.m();
		p.m();
		c.m1();
		p.m1();
		
		Parent p1 = new Child();
		p1.m();
		p1.m1();
	}
}
