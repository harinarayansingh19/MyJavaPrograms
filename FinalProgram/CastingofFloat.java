class Test
{
	public static void main(String [] ar)
	{
		float f = 16.35f;
		//f = f+200.654D;				//wont compile required casting
		System.out.println(f);
		
		f = (float)(f+200.654D);					//16.3500000000000+200=217.004
		System.out.println(f);
		
		float a = 6/4;					//it will consider  "float 1.0 = int 6/int 4"   *** actually first right side then left side operation performs
		System.out.println(a);			//thats whay 		float(1.0) = int 1
		
		float b = (float)6/4;
		System.out.println(b);			//it gives 1.5
	}
}	