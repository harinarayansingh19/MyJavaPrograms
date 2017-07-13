import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		m();
		throw new IOException("this is exception");
		
	}
	static void m()
	{
		throw new RuntimeException("m1 exception");
	}
}