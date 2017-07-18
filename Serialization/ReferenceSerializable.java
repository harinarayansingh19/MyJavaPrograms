import java.io.*;

class A
{
	int a;
}
class B implements Serializable
{
	A a;
	int b;
}

class C implements Serializable
{
	B b;
}


class Test
{
	public static void main(String [] asr) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("a.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		
		A a1 = new A();
		a1.a = 100;
		//o.writeObject(a1);				// not serializable ...........bcoz it only serialize A and A is not implementing Serializable
		
		
		
		B b1 = new B();
		//b1.a = a1;					// A is not implementing serializable. so if we comment this then there will be no problem
		b1.b = 200;
		o.writeObject(b1);		

		
		
		//C c = new C();
		//o.writeObject(c);				//successfully serialized bcoz C is implementing serializable
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("a.txt"));
		B b2=(B)fin.readObject();
		
		System.out.println(b2.b);		//200
		System.out.println(b2.a);		// null bcoz "a.txt" doesnt have A object. so it gives default value	
	
	}
}

