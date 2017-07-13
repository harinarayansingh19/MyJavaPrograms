import java.io.*;
class HariException extends IOException
{
	public String getMessage(){
		return "you r not hari";
	}
}
class Test
{
	static void name(String str)
	{
		if(str.equalsIgnoreCase("hari"))
			System.out.println("ok varified u r hari ");
		else
			try{
				throw new HariException();
			}
			catch(Throwable e)
			{
				System.out.println("exception handled ");
			}
			
	}
	public static void main(String [] ar)
	{
		name("Hari");
	}
}