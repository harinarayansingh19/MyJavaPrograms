import java.io.*;

class A
{
	
}
class B implements Serializable
{
	int a = 100;
	transient int b = 200;
	final int c = 200;
	transient final int d = 300;
	static int e = 400;
	transient static int f = 500;
	String s1 = "hari";
	transient String s2 = "singh";
	transient final String s3 = "hello";
	transient A a1 = new A();
	transient final A a2 = new A();
}

class Test
{
	public static void main(String [] ar) throws Exception
	{
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("a.txt"));
		B b = new B();
		o.writeObject(b);
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("a.txt"));
		B b1 = (B)fin.readObject();
		
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
		System.out.println(b1.e);
		System.out.println(b1.f);
		System.out.println(b1.s1);
		System.out.println(b1.s2);
		System.out.println(b1.s3);
		System.out.println(b1.a1);
		System.out.println(b1.a2);		
	}
}
