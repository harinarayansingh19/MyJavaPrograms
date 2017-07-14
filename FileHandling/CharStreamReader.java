import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		FileReader fr = new FileReader("abcd.txt");
		int a =0;
		
		while(a!=-1)
		{
			a = fr.read();
			System.out.print((char)a);
		}
	}
}