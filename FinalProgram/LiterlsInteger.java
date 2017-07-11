class Test
{
	public static void main(String [] ar)
	{
		//integer literls    1.decimal   2.octal    3.binary   4.hexadecimal 
		
		int a = 10;
		int b = 07;   
		//int c = 08;      //error bcoz octal supports only 0-7
		int d = 0B0;
		int e = 0b1;
		//int f = 0b2;	//error bcoz binary only 1 & 0
		int g = 0xA;
		int h = 0Xf;
		//int i = 0XK;		//error hexadeciml 0-9 , A - F
		
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		//System.out.println(i);
		
	}
}	