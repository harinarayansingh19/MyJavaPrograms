class IncDec
{
	public static void main(String []s)
	{
		/*
		int a=5;
		int c= a++;
		
																	//in pre(++a) first increment ya dec then assign
		System.out.println(a);	//6									//in post(a++) first assign then inc or dec
		System.out.println(c);	//5*/
		int a=10;
		/*System.out.println(++a);		//11
		System.out.println(a);			
		System.out.println(a++);
		System.out.println(a);*/
		
		/*System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);*/
		//int h= ++a+a++ + ++a;		//35
		//System.out.println(h);
		
		a = 20;
		int h = --a + a++ - ++a;
		System.out.println(h+"  "+a);
	}
}

