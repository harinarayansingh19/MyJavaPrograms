class Test
{
	
	public static void main(String [] ar)
	{
		Test1 t = new Test1(5);
		
		
	}
	
}
class Test1
{
	public Test1(int...a)				//final & static & abstract r not ALlowded
	{
		
		System.out.println("constructor11  "+a[0] );
	}
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
}