class Parent
{
	void m()
	{
		System.out.println("parent method m ");
	}
}
class Child extends Parent
{
	void m()
	{
		System.out.println("child method m ");
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
		
		Parent p1 = new Child();
		p1.m();
	}
}
