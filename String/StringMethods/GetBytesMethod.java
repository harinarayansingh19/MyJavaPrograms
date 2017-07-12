class Test 
{
	public static void main(String [] ar)
	{
		String s = "harinarayan singh";
		byte [] c = s.getBytes();
		for(int i = 0; i<c.length ; i++)
		{
			System.out.println(c[i]);   			// it return ASCII value of those char
		}
	}
}