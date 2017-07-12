class Test
{
	public static void main(String [] ar)
	{
		String s1 = new String("hari");
		
		String s2 = "ha" + "ri";
		System.out.println(s1==s2);
		
		String s3 = "ha";
		String s4 = s3 + "ri";
		System.out.println(s1==s4);
		
		String s5 = "hari";
		System.out.println(s2==s5);		//true
		
	}
}