class Test
{
	public static void main(String [] ar)
	{
		int a = 25/5;
		System.out.println(a); 				// 5
		
		a = -33/8;
		System.out.println(a); 				// -4
		
		a = -99/-3;
		System.out.println(a); 				// 33
		
		a = 33/-11;
		System.out.println(a); 				// -3
		
		//*** Special Cases
		
		double d = -10.0 / 0; 
		System.out.println(d);				// -Infinity
		
		double e  = 10.0/-0.0; 
		System.out.println(e);				// -Infinity
		
		double f = 10.0 / 0;  
		System.out.println(f);				// Infinity
		
		double g  = 10f/-0;
		System.out.println(g);				// Infinity
	}
}