class Test
{
	public static void main(String [] ar)
	{
		Test t = new Test();
		t.m1((byte)12);
	}										//both wont compile bcoz same
	
	void m1(byte ... a)
	{
			System.out.println("byte var args");
		}
		
	/*void m1(byte[] a){
			System.out.println("byte array");
		}*/
}