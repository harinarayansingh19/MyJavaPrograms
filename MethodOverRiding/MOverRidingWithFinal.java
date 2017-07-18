//we cant over ride final method
//final means no change
//while over ride says change
// it contradict here

class Parent
{
	final void m()						
	{
		System.out.println("parent method m ");
	}
	final void m1()
	{
		System.out.println("parent method m1 ");
	}
}
class Child extends Parent
{
	void m()
	{
		System.out.println("child method m ");
	}
	final void m1()
	{
		System.out.println("child method m1 ");
	}
}

class Test
{
	public static void main(String [] ar)
	{
		Parent p = new Parent();
		Child c = new Child();
		c.m();
		//p.m();
		
		Parent p1 = new Child();
		//p1.m();
	}
}
