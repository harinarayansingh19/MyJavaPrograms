class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		byte a = (byte)13;
		short b = (short)48;
		int c = 85;	
		
		t.show(a);		// this will go next wider data type so it prints int. 	that means jvm chooses widening over var args 
		t.show(b);
		t.show(c);		//
		
	}
	void show(int a)
	{
		System.out.println("int ");
	}
	void show(int...a)
	{
		System.out.println("Var Args ");
	}
}