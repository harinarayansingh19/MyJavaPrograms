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
		/*catch(Exception e)
		{
			System.out.println("Exception handled");
		}*/
		catch(ArithmeticException ar)
		{
			
			System.out.println("ApplicationException handled ");
			
		}
	}
}