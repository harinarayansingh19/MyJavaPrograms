class Parent 
{
	int a=100;
	void m1()
	{
		//m2();				// cant find symbol
	}
}
class Child extends Parent
{
	int b = a;
	void m2()
	{
		System.out.println("im child method m2 ");
	}
	void m3()
	{
		System.out.println("in child method parent variable a= "+super.a);
	}
	void m4()
	{
		System.out.println("im child method m4 b = "+b);
	}
	
}
class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		System.out.println("parent variable a= "+c.a);
		c.m2();
		c.m3();
		c.m4();
			
		//Parent p = new Parent();
		//p.m2();
		//p.m3();
	}

}