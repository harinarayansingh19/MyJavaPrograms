import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		File f = new File("hari.txt");		//it wont create
		f.createNewFile();				//exception must be handled
		
		
		// to check exists()
		
		if (f.exists()) 
			System.out.println("file present");

		else
			System.out.println("file not present");
	}
}