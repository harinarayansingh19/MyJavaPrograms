class Table
{
	int n;
	 void printTable(int n) 		
	{
		synchronized (this)
		{
			for(int i = 1; i < 6 ; i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(10);					//
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
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
		t.printTable(2);
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
		t.printTable(3);
	}
}
class MyThread3 extends Thread
{
	Table t;
	public MyThread3(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(4);
	}
}
class MyThread4 extends Thread
{
	Table t;
	public MyThread4(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread5 extends Thread
{
	Table t;
	public MyThread5(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(6);
	}
}
class Test
{	
	public static void main(String [] ar)
	{
		Table t = new Table();
		MyThread1 m1 = new MyThread1(t);
		MyThread2 m2 = new MyThread2(t);
		MyThread3 m3 = new MyThread3(t);
		MyThread4 m4 = new MyThread4(t);
		MyThread5 m5 = new MyThread5(t);
		
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
				
	}
}

