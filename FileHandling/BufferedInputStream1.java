import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException,FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("hi1.txt");
	
		BufferedInputStream bos = new BufferedInputStream(fis);            	
		String s = "hello how r u";
		int a =0;
		
		while(a!=-1)
		{
			a = bos.read();
			System.out.print((char)a);
			
		}
	}
}