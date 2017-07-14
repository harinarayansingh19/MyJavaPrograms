class Test implements Cloneable
{
	int a;
	public static void main(String [] ar) throws CloneNotSupportedException
	{
		Test t = new Test();
		t.a = 100;					// its in t
		System.out.println(t.a);
		
		Test t1 = (Test)t.clone();
		System.out.println(t1.a);	//it also in t1
	}
	
	public Test()
	{
		System.out.println("im constructor of Test class");
	}	
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}