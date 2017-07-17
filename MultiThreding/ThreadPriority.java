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
		MyThead m = new MyThead();
		MyThead m1 = new MyThead();
		MyThead m2 = new MyThead();
		MyThead m3 = new MyThead();
		MyThead m4 = new MyThead();
		MyThead m5 = new MyThead();
		MyThead m6 = new MyThead();
		MyThead m7 = new MyThead();
		MyThead m8 = new MyThead();
		
		
		// priority depends upon thread schedular whether u have set priority highest. it is not necessary it will execute in your order
		
		m.getPriority();			// by default priority of all thread  is 5
		System.out.println(m.getPriority());
		m1.setPriority(1);
		m2.setPriority(5);
		m3.setPriority(10);
		m4.setPriority(3);
		m5.setPriority(8);
		
		// these r 3 constant of thread class
		
		m6.setPriority(Thread.MIN_PRIORITY);
		m7.setPriority(Thread.MAX_PRIORITY);
		m8.setPriority(Thread.NORM_PRIORITY);
		
		// it is invalid argu for this method
		
		/*m.setPriority(0);				// exception will occur
		m.setPriority(-1);
		m.setPriority(11);*/
		
		m.start();
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		m6.start();
		m7.start();
		m8.start();
		
		
		
		
		
			
			
			
			
			
			
			
	}
}
