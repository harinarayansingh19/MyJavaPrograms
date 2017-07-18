import java.io.*;
class A
{
	int a;
}
class B extends A implements Serializable
{
	int b = 200;
}

class Test
{
	public static void main(String [] ar) throws Exception
	{
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("a.txt"));
		B b = new B();
		b.a=100;
		o.writeObject(b);
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("a.txt"));
		B b1 = (B)fin.readObject();
		
		System.out.println(b1.a);
		System.out.println(b1.b);
		
	}
}
