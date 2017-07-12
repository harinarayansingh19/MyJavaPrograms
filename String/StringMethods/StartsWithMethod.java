class Test
{
	public static void main(String [] ar)
	{
		String s = "harinarayan";
		
		System.out.println(s.startsWith("h"));		//return true 
		System.out.println(s.startsWith("n"));			//false				
		
		System.out.println(s.startsWith("hari"));		//true
		System.out.println(s.startsWith("yan"));	 // false				
	}
}