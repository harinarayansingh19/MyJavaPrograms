import java.math.*;
class BigPrint
{
	public static void main(String [] ar)
	{
		BigInteger b = new BigInteger("1000000000000000000000000000000000000000000000000000000");
		BigInteger a =  new BigInteger("654987656549841368978453698745568945");
		//b = b.add(a);
		System.out.println(b.add(a));
	}
}