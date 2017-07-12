class Test
{
	public static void main(String [] ar)
	{
		String s1 = "harinarayan";
		//s1.concat("hello");
		System.out.println(s1.concat("singh"));  			// harinarayansingh
		System.out.println(s1);							// harinarayan
		
		String s2 = s1.concat("singh");
		System.out.println(s2);							// harinarayansingh
	}
}