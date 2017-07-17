class Resource1
{
	
}
class Resource2
{
	
}
class MyThread1 extends Thread
{
	Resource1 r1;
	Resource2 r2;
	public MyThread1(Resource1 r1, Resource2 r2)
	{
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public void run()
	{
		synchronized (r1)
		{
			System.out.println("got lock on r1 "+Thread.currentThread().getName());
			synchronized (r2)
			{
				System.out.println("waiating for r2 ");
			}
		}
	}
	
}
class MyThread2 extends Thread
{
	Resource1 r1;
	Resource2 r2;
	public MyThread2(Resource1 r1, Resource2 r2)
	{
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public void run()
	{
		synchronized (r2)
		{
			System.out.println("got lock on r2 "+Thread.currentThread().getName());
			synchronized (r1)
			{
				System.out.println("waiating for r1 ");
			}
		}
	}
}
class Test
{
	public static void main(String [] ar)
	{
		Resource1 r11 = new Resource1();
		Resource2 r22 = new Resource2();
			
		MyThread1 m1 = new MyThread1(r11,r22);
		MyThread2 m2 = new MyThread2(r11,r22);
		
		m1.start();
		m2.start();
	}	
}
	
