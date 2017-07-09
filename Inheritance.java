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
}
class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		//Parent p = new Parent();
	}
}