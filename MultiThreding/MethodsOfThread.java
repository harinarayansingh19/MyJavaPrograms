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
		
		System.out.println(Thread.currentThread());
		System.out.println(m.getState());
		System.out.println(m.getPriority());
		m.setPriority(8);
		System.out.println(m.getThreadGroup());
		m.setName("mine");
		
		
		m.start();
		
		
	}
}
