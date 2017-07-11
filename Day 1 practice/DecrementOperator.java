class Test
{
	public static void main(String [] ar)
	{
		// pre Decrement				** in pre(++a) first Decrement then assign
		
		int a = 10;
		System.out.println(a);
		
		System.out.println(--a);			// 9
		System.out.println(a);				// 9

		//post Decrement				** in post(a++) first assign then Decrement
		
		int b = 20;
		System.out.println(b);
		
		System.out.println(b--);			// 20
		System.out.println(b);				// 19
				
		
		//que 
		int h = --a + b-- + --a;			// 34
		System.out.println(h);
	}
}