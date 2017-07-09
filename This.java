class Test{
	static int a=10;
	int b=44;
	public Test(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
		System.out.println(b);
	}
	 /*static void m()
	{
		System.out.println(this.a);             //we cant access static variable using this keyword
	}*/
	public static void main(String  [] ae)
	{
		Test t = new Test(66,45);
		System.out.println(t.a);
		System.out.println(t.b);
		//t.m();
	}
}