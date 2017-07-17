class Test
{
	public static void main(String [] ar)
	{
		Runtime r = Runtime.getRuntime();
		System.out.println(r.availableProcessors());
		
		System.out.println(r.freeMemory());			//jvm memory
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		
	}
}
