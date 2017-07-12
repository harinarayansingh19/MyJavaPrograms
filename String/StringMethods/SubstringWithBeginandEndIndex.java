class Test 
{
	public static void main(String [] ar)
	{
		String s = "harinarayan singh";
		System.out.println(s.substring(0,5)); 	// will print form index 0 to 4 bcoz it exclude endindex
		
		/*System.out.println(s.substring(-2,6)); 
		System.out.println(s.substring(4,-7)); 
		System.out.println(s.substring(-10,-8)); */		
		
		//System.out.println(s.substring(6,2));		// out of range
		
		
		System.out.println(s);	//it will take automatically with only begin index
	
	}
}