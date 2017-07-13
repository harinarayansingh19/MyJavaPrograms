class Test
{
	public static void main(String [] args)
	{
		try
		{
			int a = 10/0;
			System.out.println("try ");	
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
			
			//System.exit(0);		//finally wont run
		}
		finally
		{
			System.exit(0);
			System.out.println("im finally 1");
		
		}	
		
	}
}