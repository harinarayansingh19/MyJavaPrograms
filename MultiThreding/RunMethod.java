class MyThead extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());		
	}
}

class Test
{
	public static void main(String [] ar)
	{
		MyThead m = new MyThead();
		m.run();		// m is not start yet so it call the main thread which is running currently
		
	}
}