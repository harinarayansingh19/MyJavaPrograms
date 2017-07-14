import java.io.*;
class Test
{
	public static void main(String [] ar) throws FileNotFoundException, IOException
	{
		FileInputStream fin = new FileInputStream("abc.txt");   //if wasnt there it gives exception , it doesnt creste file
		FileOutputStream fout = new FileOutputStream("abc1.txt");	//it create if is not present. if present then it override 
		
		int a =0;
		
		while(a!=-1)
		{
			a = fin.read();
			fout.write(a);
		}
	}
}