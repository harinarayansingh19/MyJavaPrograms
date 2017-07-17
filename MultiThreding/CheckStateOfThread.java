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
		
		System.out.println(m.getState());			// New
		
		m.start();
		System.out.println(m.getState());  			// Depend upon CPU Runnable or terminated		
		
		System.out.println(m1.getState());
		m1.start();
		System.out.println(m1.getState());
		
		MyThead m2 = new MyThead();
		MyThead m3 = new MyThead();
		MyThead m4 = new MyThead();
		MyThead m5 = new MyThead();
		MyThead m6 = new MyThead();
		
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		m6.start();
	
		System.out.println(m2.getState());
		System.out.println(m3.getState());
		System.out.println(m4.getState());
		System.out.println(m5.getState());
		System.out.println(m6.getState());
		
		
		
	}
}