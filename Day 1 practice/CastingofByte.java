class Test
{
	public static void main(String [] ar)
	{
		byte a = 10;
		a = (byte)(a+2);				//10+2=12
		System.out.println(a);
		a = (byte)(a+10.5);				//12+10=22			//here we wont consider 10.5
		System.out.println(a);
	}
}