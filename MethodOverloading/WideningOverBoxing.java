class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		byte a = (byte)15;		
		int b = 65;				
		long c = 12;				
		float d = 20.36f;				
		short e = (short)98;			
		
		t.show(a);		//it should choose Integer wrapper class but jvm chooses Widneing over Boxing thats why it print long
		t.show(b);		// it is int and here Integer wrapper class present but it jvm choses widening
		t.show(c);		//it has its own paramter 
		t.show(d);		//it has its own paramter
		t.show(e);
	}
	void show(float a)
	{
		System.out.println("float");
	}
	void show(Integer a)
	{
		System.out.println("Integer wrapper class");
	}
	void show(long a)
	{
		System.out.println("long");
	}
	
}