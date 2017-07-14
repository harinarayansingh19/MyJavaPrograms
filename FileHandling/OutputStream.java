import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("a.txt");	// if file is ot present it create first "a.txt" then write
		String s = "hi hari hello";
		fout.write(s.getBytes());			// it is byte type
		//fout.write(97);					// it print a 
	}
}