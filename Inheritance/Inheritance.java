class Parent
{
	static int a;
	int b;
	static
	{
		System.out.println("parent static block");
	}
	{
		System.out.println("parent instance block");
	}
	public Parent()
	{
		System.out.println("parent default constructor");
	}
	public Parent(int b)
	{
		//this.b = b;
		System.out.println("parent class parametrise constructor "+b);
	}
}
class Child extends Parent
{
	static int a;
	int b;
	static{
		System.out.println("child static block");
	}
	
	{
		System.out.println("instance of child block");
	}
	
	public Child()
	{
		System.out.println("child class default constructor");
	}
	public Child(int b)
	{
		this.b = b;
		System.out.println("child class parametrise  constructor "+b);
	}
}
class Test
{
	public static void main(String [] ar)
	{
		Child c1 = new Child();
		System.out.println("=========C1 Ends===========");
		Child c2 = new Child(15);
		System.out.println("==============C2 Ends===========");
		
		/*
		Child c3 = (Child)new Parent();									// error parent cant converted to child
		System.out.println("==============C3 Ends===========");			// if u cast child type then it gives ClassCastException
		Child c4 = (Child)new Parent(13);
		System.out.println("==============C4 Ends===========");*/
		
		Parent p1 = new Parent();
		System.out.println("==============P1 Ends===========");
		Parent p2 = new Parent(5);
		System.out.println("==============P2 Ends===========");
		Parent p3 = new Child();
		System.out.println("==============P3 Ends===========");
		Parent p4 = new Child(10);
		System.out.println("==============P4 Ends===========");
		
	}
}