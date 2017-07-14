import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		FileInputStream fin = new FileInputStream("a.txt");
		int a=0;
		while(a!=-1)
		{
			a = fin.read();
			System.out.print((char)a);
		}
	}
}