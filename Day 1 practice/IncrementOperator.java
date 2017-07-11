class Test
{
	public static void main(String [] ar)
	{
		// pre Increment				** in pre(++a) first increment then assign
		
		int a = 10;
		System.out.println(a);
		
		System.out.println(++a);	 	//	11
		System.out.println(a);			//  11

		//post increment				** in post(a++) first assign then increment
		
		int b = 20;
		System.out.println(b);
		
		System.out.println(b++);		// 20
		System.out.println(b);			// 21
		
		
		//que 
		int h = ++a + b++ + ++a;		// 46
		System.out.println(h);
	}
}