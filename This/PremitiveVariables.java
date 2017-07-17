class Test {
	
	int a;
	
	public static void main(String[] ar) 
	{
		Test t = new Test();
		
		System.out.println("in main "+t.a);
		t.m1(t.a);
		System.out.println("in main "+t.a);    
		
	}
	
	void m1(int a){
		System.out.println("in m1...");
		a = 100;
		System.out.println("in m1 a= "+a);    
	}
}