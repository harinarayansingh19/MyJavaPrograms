class MyThead extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());		
	}
}
class Test
{
	public static void main(String [] ar) throws Exception
	{
		MyThead m = new MyThead();
		MyThead m1 = new MyThead();
		
		m.start();
		m1.start();
		m1.join();
		
		MyThead m2 = new MyThead();
		MyThead m3 = new MyThead();
		
		m2.start();
		m2.join();
		m3.start();
		
		MyThead m4 = new MyThead();
		m4.start();
	}
}
		