import java.util.Scanner;
class Test
{
	public static void main(String [] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("result "+c);	
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
			
			/*finally
			{
			System.out.println("checking");
			}*/
		}
		finally
		{
			System.out.println("im finally 1");
		
		}
		/*finally						//must follow try or catch block
		{
			System.out.println("im finally 2");
		
		}*/
		
		
	}
}