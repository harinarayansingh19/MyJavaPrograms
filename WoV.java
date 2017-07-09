class Widening3
{
	public static void main(String [] ar)
	{
		Widening3 w = new Widening3();
		byte a = 67;
		w.sum(a);
		
	}
	void sum(short a)
	{
		System.out.println("short widning" );
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