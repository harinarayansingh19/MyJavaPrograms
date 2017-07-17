class Table 
{
	synchronized static void printTable1(int n)
	{
				
		 for (int i = 1; i <= 5; i++)
			 {
				System.out.println(n*i);
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{
						System.out.println(e);
				}
				
			}
	}
			
	synchronized void printTable2(int n)
	{
		
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
			
}

class MyThread1 extends Thread
{
	Table t;
	public MyThread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable1(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	public MyThread2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable2(6);
	}
}

class Test
{	
	public static void main(String [] ar)
	{
		Table t = new Table();
		MyThread1 m1 = new MyThread1(t);			// printTable1 is statis so it has lock but class laevel
		MyThread2 m2 = new MyThread2(t);			//printTable2 is synchronized so it will have lock on object time
		
		m1.start();
		m2.start();
		
	}
}
