class Test
{
	public static void main(String [] ar)
	{
		StringBuffer sb = new StringBuffer("harinarayan");
		System.out.println(sb);
		
		System.out.println(sb.append(" singh"));
		
		StringBuffer sb1 = new StringBuffer("harinarayan Singh Lodhi");
		System.out.println(sb1.delete(5,12));
		
		StringBuffer sb2 = new StringBuffer("harinarayan Singh Lodhi");
		System.out.println(sb2.insert(12, "hello"));
		
		StringBuffer sb3 = new StringBuffer("harinarayan Singh Lodhi");
		System.out.println(sb3.reverse());
		
	}
}