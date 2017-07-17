
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
		Thread t = new Thread();
		System.out.println(Thread.currentThread().getName());
		System.out.println("main thread "+t.isDaemon());			// false value- it is not daemon thread.And  main thread is already start so
		//t.start();
		
		//System.out.println(t.getName());
		
		t.setDaemon(true);
		
		System.out.println("main thread "+t.isDaemon());
		
		
		MyThead m = new MyThead ();
		System.out.println("MyThread "+m.isDaemon());
		m.setDaemon(true);
		System.out.println("MyThread "+m.isDaemon());
	}
}
