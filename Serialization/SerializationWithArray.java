import java.io.*;

class Test
{

	public static void main(String[] args) throws Exception 
	{
		
		
		FileOutputStream fout = new FileOutputStream("am5.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fout);
		
		Object [] arr = new Object[2];
		arr [0] = new A();
		arr [1] = new B();
		
		oo.writeObject(arr);

	}

}
class A implements Serializable 
{
	
} 
class B implements Serializable 
{
	
}