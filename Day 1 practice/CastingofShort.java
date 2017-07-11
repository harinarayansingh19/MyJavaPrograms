class Test
{
	public static void main(String [] ar)
	{
		short a = 12;
		a = (short)(a+74);				//12+74=86
		System.out.println(a);
		a = (short)(a+20.7);				//86+20=106				//here we wont consider 20.7
		System.out.println(a);
		a = (short)(a+100L);				//106+100=206
		System.out.println(a);
	}
}
		