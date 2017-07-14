import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException
	{
		File f = new File("hari\\singh\\thakur");
		
		/*File f1 = new File(f, "a.txt");				// it create file in current directory where f is pointing
		f1.createNewFile();*/
		
		File f1 = new File(f.getParent(), "a.txt");			
		f1.createNewFile();
		
		//to find path of file
		
		System.out.println(f.getAbsolutePath());



	}
}