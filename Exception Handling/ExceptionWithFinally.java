import java.util.Scanner;
class Test
{
	public static void main(String [] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter first value");
			int a = sc.nextInt();
			System.out.println("enter second value");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("result "+c);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
		}
		finally
		{
			System.out.println("always execute and its running");
		
		}
		
	}
}