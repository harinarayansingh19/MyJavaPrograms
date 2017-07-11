class Test
{
	public static void main(String [] ar)
	{
		long a = 16452;
		int b = 7;
		a = a+b;						//implicit cast ....compiler will do		
		System.out.println(a);			//16452+7=16459
		
		//a = a+65.66f;					//wont compile
		
		a = (long)(a-65.66f);					//16459-65=16393		//wont consider 65.66
		System.out.println(a);
		a = (long)(a+200.654D);					//16393+200=16593
		System.out.println(a);
	}
}
		