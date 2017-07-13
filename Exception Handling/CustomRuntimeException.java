class HariException extends RuntimeException
{
	public String getMessage(){
		return "you r not hari";
	}
}
class Test
{
	static void name(String str)
	{
		if(str.equalsIgnoreCase("hari"))
			System.out.println("ok varified  ");
		else
			throw new HariException();
			
	}
	public static void main(String [] ar)
	{
		name("Hari");
	}
}