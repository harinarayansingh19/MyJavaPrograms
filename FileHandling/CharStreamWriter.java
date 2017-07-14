import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		FileWriter fw = new FileWriter("abcd.txt");	//abcd.txt will create
		String s = "hello how r u";
		fw.write(s);		//it doesnt write in the file
		fw.flush();
		//fw.close();
	}
}