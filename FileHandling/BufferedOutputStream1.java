import java.io.*;
class Test
{
	public static void main(String [] ar) throws IOException,FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("hi1.txt");
	
		BufferedOutputStream bos = new BufferedOutputStream(fos);            	
		String s = "hello how r u";
		bos.write(s.getBytes());		//it doesnt write in the file
		//bos.flush();
		bos.close();
	}
}