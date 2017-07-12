class Test 
{
	public static void main(String [] ar)
	{
		String s = "harinarayan singh";
		s = s.substring(0); 	// will print form begining
		System.out.println(s);	
		
		s = s.substring(2);		// will print from index 2
		System.out.println(s); // so now string will become s = "rinarayan singh"

		s = s.substring(0);		// now static has changed
		System.out.println(s);	// thats why it is printing s = "rinarayan singh"
		
		s = s.substring(-11); 
		System.out.println(s);	// error
		
		s = s.substring(99);
		System.out.println(s);	// out of 
	
	}
}