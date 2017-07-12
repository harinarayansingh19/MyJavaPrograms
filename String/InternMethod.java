class Test
{
	public static void main(String [] ar)
	{
		String s1 = new String("hari");
		String s2 = "hari";
		
		System.out.println(s1 == s2);
		System.out.println(s1.intern() == s2);
		
	}
}