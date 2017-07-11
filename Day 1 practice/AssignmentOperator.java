class Test
{
	public static void main(String [] ar)
	{
		byte a = 20;
		System.out.println(a);
		
			/*a = a+30;						//required type casting
			System.out.println(a);*/
			
			a += 30;					//50
			System.out.println(a);
			
			//now value of a will be = 50
			a -= 10;						//40
			System.out.println(a);
			 
			 //now value of a will be = 40
			a *= 10;	   				    	//-112
			System.out.println(a);
			
			 //now value of a will be = -112
			a /= 10;							//-11
			System.out.println(a);
			
			int b = 10;
			b = b+30;								// but in this case no need of casting bcoz int + int = int
			System.out.println(b);
			
			/*int c = 60;
			c = c+10.2;								//here casting required bcoz int + float = float
			System.out.println(c);*/
			
			int d = 70;
			d += 10.25;							//dont need to case but print only int.
			System.out.println(d);
			
	}
}