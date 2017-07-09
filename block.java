class Block1
{
	public static void main(String [] ar)
	{
		A aa = new A();
		A ab = new A();
	}
}
class A{
	static{
		System.out.println("hello this is static block 1");
	}
	/*static{
		System.out.println("hello this is static block 2");
	}*/
	{
		System.out.println("hello this is instance block 1");
	}
	{
		System.out.println("hello this is instance block 2");
	}
}