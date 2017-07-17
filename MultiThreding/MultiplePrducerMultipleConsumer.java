import java.util.LinkedList;

class Test
 {

	public static void main(String[] args) throws InterruptedException 
	{
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
		
		p.start();
		c.start();
	}

}
class Resource
{
	int MAX = 2;
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	synchronized void producer(int n) throws InterruptedException
	{
		if(list.size()==MAX)
		{
			wait();
		}
		
		System.out.println("produce "+n);
		list.add(n);
		notify();
	}
	
	synchronized void consumer() throws InterruptedException
	{
		if(list.isEmpty())
		{
			wait();
		}
		
		System.out.println("consume "+list.remove());
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
		for (int i = 0; i < 6; i++) 
		{
			try 
			{
				r.producer(i);
			} 
			catch (InterruptedException e) 
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
		for (int i = 0; i < 6; i++) 
		{
			try 
			{
				r.consumer();
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);	
			}
		}
	}
	
}