class Test
{
	public static void main(String [] ar)
	{
		// always escape sequence starts from     '\ something'    
		
		char a = '"'; 				//running		"
		char b = '\"'; 				// running    "
		char c = '\'';				//running 		'
		//char d = '''; 				//error
		char e = '\\';					//running 		\
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
		System.out.println(e);
	}
}