class MyThead implements Runnable
{
	public void run()
	{
		System.out.println("im MyThread");
		System.out.println(Thread.currentThread());		
		
	}
}

class Test
{
	public static void main(String [] ar)
	{
		MyThead m = new MyThead();				// normal Object
		Thread t = new Thread(m);				// thread object
		t.start();
		
		Thread t1 = new Thread(m);
		t1.start();
		
		
		
	}
}