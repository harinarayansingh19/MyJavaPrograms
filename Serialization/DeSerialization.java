import java.io.*;

class Test
{
	public static void main(String [] asr) throws Exception
	{
		FileInputStream fin = new FileInputStream("a.txt");
		ObjectInputStream o = new ObjectInputStream(fin);
		
		//System.out.print(o.readObject());
		
		Student s = (Student)o.readObject();
		System.out.println(s.roll+"  "+s.name);
	}
}
