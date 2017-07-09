class Widening4
{
	public static void main(String [] ar)
	{
		Widening4 w = new Widening4();
		byte a = 67;
		w.sum(a);
		
	}
	void sum(Byte a)
	{
		System.out.println("Byte" );
	}
	void sum(byte...b)
	{
		System.out.println("byte var args");
	}
	/*void sum(byte [] c)
	{
		System.out.println("byte array" );
	}*/
}