class Test
{
	public static void main(String [] ar)
	{
		int a = 12;
		byte b = 7;
		a = a+b;						//implicit cast ....compiler will do		
		System.out.println(a);			//12+7=19
		a = (int)(a+25.9);				//19+25=44			//wont consider 25.9
		System.out.println(a);
		a = (int)(a+20000L);				//44+20000=20044
		System.out.println(a);
	}
}
		