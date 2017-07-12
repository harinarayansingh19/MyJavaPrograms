class Test
{
	public static void main(String [] ar)
	{
		String s1 = "hari";
		String s2 = "Hari";
		String s3 = "hari";
		String s4 = "singh";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s2));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s3.equalsIgnoreCase(s4));


	}
}