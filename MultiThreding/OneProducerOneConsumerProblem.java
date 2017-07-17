class Resource
{
	volatile int n;
	volatile boolean isProduced = false;
	
	synchronized void produce(int n) throws Exception
	{
		if(isProduced)
			wait();
		
		System.out.println("produced "+n);
		isProduced = true;
		notify();
	}
	synchronized void consume(int n) throws Exception
	{
		if(!isProduced)
			wait();
		System.out.println("consumed "+n);
		isProduced = false;
		notify();
	}
}
class Producer extends Thread 
{
	Resource r;
	public Producer(Resource r)
	{
		this.r = r;
	}
	public void run() 
	{
		for(int i = 1; i < 6; i++)
		{
			try
			{
				r.produce(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Consumer extends Thread
{
	Resource r;
	public Consumer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		for(int i = 1; i < 6; i++)
		{
			try
			{
				r.consume(i);
			}
			catch(Exception e)
			{
				System.out.println(e);	
			}
		}
	}
}
class Test
{
	public static void main(String [] ar)
	{
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		
		p.start();
		c.start();
	}
}