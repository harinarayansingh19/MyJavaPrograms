class Test
{
	public static void main(String [] ar)
	{
		String s = "harinarayan";
		
		System.out.println(s.endsWith("h"));		//return false 
		System.out.println(s.endsWith("n"));			//true				
		
		System.out.println(s.endsWith("ri"));		//false
		System.out.println(s.endsWith("yan"));	 // true				
	}
}