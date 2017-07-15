class Address
{
	String city;
	public Address(String city)
	{
		this.city = city;
	}
}
class Test
{
	final Address adr = new Address("Indore");
	
	public static void main(String [] ar)
	{
		
		//final Address adr = new Address("Indore");
		//Address adr = new Address("Pune");			//cant re initilize
		
		Test t = new Test();
		t.adr.city = "Banglore";
		
		System.out.println(t.adr.city);
	}
}