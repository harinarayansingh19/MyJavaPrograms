class MyThead extends Thread
{
	public void run()
	{
		System.out.println("im MyThread");
		System.out.println(Thread.currentThread());		// prints thread name, thread no , thread group
		
	}
}
class Test
{
	public static void main(String [] ar)
	{
		MyThead m = new MyThead();
		m.start();
	}
}