class Test
{
	static int a=10;
	int b=44;
	
	public Test(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("con 1 "+a);
		System.out.println("con 2 "+b);
		System.out.println("con 3 "+a);
		System.out.println("con 4 "+b);
	}
	 /*static void m()
	{
		System.out.println(this.a);             //we cant access static variable using this keyword
	}*/
	
	public static void main(String  [] ae)
	{
		Test t = new Test(66,45);
		System.out.println("main 1 "+t.a);
		System.out.println("main 2 "+t.b);
		//t.m();
	}
}