import java.io.*;
class Test
{
	public static void main(String [] ar)
	{
		File f = new File("hari\\singh\\thakur");
		f.mkdirs();					//f.mkdir()    when only one directory
		
		 //to check wether directory is created or not
		if (f.exists()) 
			System.out.println("directory present");
		
		
		else
			System.out.println("directory not present");
		
	}
}