class MyThead extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());		
	}
	// what if u override start()
	
	/*public void start()
	{
						
		System.out.println("hello");				//will print hello..............no exceptionwill occur
	}
	*/
	
	
	
	
}

class Test
{
	public static void main(String [] ar)
	{
		MyThead m = new MyThead();
		MyThead m1 = new MyThead();
		m.start();
		
		//m.start();				//illegal thread state exception     u cant start thread twicw bcoz its already started
		
		m1.start();
		
		
		
		
	}
}