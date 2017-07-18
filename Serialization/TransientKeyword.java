import java.io.*;;

class A
{
	int a;
	int b;
}
class B implements Serializable
{
	transient A a;			// we transient "a" : so during serializable it will skip ie only b will save
	int c;
	
	private void writeObject(ObjectOutputStream oos) throws Exception 
	{
		oos.defaultWriteObject();
		oos.writeInt(10);			// this value goes to b 
	}
	
	private void readObject(ObjectInputStream ois) throws Exception 
	{
		ois.defaultReadObject();
		a = new A();
		a.b = ois.readInt();	
	}
}


class Test 
{

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("a.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fout);
		
		B b = new B();
		b.c = 100;
		
		oo.writeObject(b);
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("a.txt"));
		B b1 = (B)fin.readObject();
		
		System.out.println(b1.c);
		
		System.out.println(b1.a.a);
		System.out.println(b1.a.b);
	}

}