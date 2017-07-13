import java.io.*;
class Parent
{
	void show()
	{
		System.out.println("im parent class");
	}
}
class Child extends Parent
{
	void show() throws RuntimeException
	{
		System.out.println("im child class exception");
	}
}

class Test
{
	public static void main(String [] ar)
	{
		Child c = new Child();
		c.show();
	}
}