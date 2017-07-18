class Parent
{
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("m1 method "+a);
	}
	void m2()
	{
		System.out.println("m2 method "+a);
		System.out.println("m2 method "+b);
	}
}

class Child extends Parent
{
	static int a=30;
	int b=40;
	
	void m3()
	{
		m1();
		m2();
	}
	
	void m4()
	{
		int a = 50;
		int b = 79;
		System.out.println("m4 method super keyword "+super.a);
		System.out.println("m4 method super keyword "+super.b);
		System.out.println("m4 method this keyword "+this.a);
		System.out.println("m4 method this keyword "+this.b);
		System.out.println("m4 method "+a);
		System.out.println("m4 method "+b);
	}
}

class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		c.m3();
		c.m4();
		//Parent p = new Parent();
		//p.m1();
	}
}

