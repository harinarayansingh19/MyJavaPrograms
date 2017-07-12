class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		
		byte a = (byte)13;
		short b = (short)48;
		
		int c = 85;	
		
		t.show(a);	//jvm chooses widening over var args.
		t.show(b);
		
		t.show(c);		//it goes to wrapper class bcoz jvm chooses boxing over var args
		
		
		
	}
	void show(Integer a)
	{
		System.out.println("Integer wrapper class");
	}
	
	/*void show(int a)
	{
		System.out.println("int ");
	}*/
	
	/*void show(short... a)
	{
		System.out.println("byte ");
	}*/
	
	void show(int...a)
	{
		System.out.println("Var Args ");
	}
}	