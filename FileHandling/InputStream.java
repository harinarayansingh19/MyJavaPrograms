import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		FileInputStream fin = new FileInputStream("a.txt");
		int a = fin.read();
		System.out.print((char)a);		// it gives first char
		
		int b = fin.read();
		System.out.print((char)b);
		int c = fin.read();
		System.out.print((char)c);
		int d = fin.read();
		System.out.print((char)d);
		int e = fin.read();
		System.out.print((char)e);
		int f = fin.read();
		System.out.print((char)f);
		int g = fin.read();
		System.out.print((char)g);
		int h = fin.read();
		System.out.print((char)h);
		int i = fin.read();
		System.out.print((char)i);
		int j = fin.read();
		System.out.print((char)j);
		int k = fin.read();
		System.out.print((char)k);
		int l = fin.read();
		System.out.print((char)l);
		int m = fin.read();
		System.out.print((char)m);
		int n = fin.read();
		System.out.print(n);		//it prints -1 when file ends it prints -1
		System.out.print((char)n);	// ASCII of ? is -1
		
		
		
	}
}