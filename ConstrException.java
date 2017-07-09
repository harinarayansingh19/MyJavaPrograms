
class Test{
	
	public static void main(String ... ar){
		Test1 t1 = new Test1();
		System.out.println(t1.a);
	}
}

class Test1{
	int a ;
	public Test1(){
		System.out.println("In constructor ");
		
		throw new RuntimeException("Exception occured ");
	}
}