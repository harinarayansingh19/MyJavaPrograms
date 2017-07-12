class Test
{
	public static void main(String [] ar)
	{
		String s1 = "hari";
		String s2 = "Hari";
		String s3 = "hari";
		String s4 = "singh";
		
		System.out.println(s1.compareTO(s2));
		System.out.println(s1.compareTO(s3));
		System.out.println(s3.compareTO(s2));
		
		System.out.println(s1.compareTO(s4));
		System.out.println(s2.compareTO(s4));
		System.out.println(s3.compareTO(s4));


	}
}