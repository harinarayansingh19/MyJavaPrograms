class Test implements Cloneable
{
	public static void main(String [] ar) throws CloneNotSupportedException
	{
		Test t = new Test();
		
		
		Test t1 = (Test)t.clone();
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